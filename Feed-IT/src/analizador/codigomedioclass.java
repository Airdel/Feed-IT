//Actividad 5. Desarrollar el programa del código intermedio

String cadenaLimpia = Depurador.getText();
char[] msj = cadenaLimpia.toCharArray();
boolean correcto = false;

/*
 txtLog  -> Log de mensajes
 txt_notificaciones -> Notificaciones compilador
*/
Paren_Llav.removeAllElements();
for(int i = 0; i < msj.length;i++){
    if((msj[i]=='(') || (msj[i]=='{')){
        Paren_Llav.push(msj[i]);
    }
    try {
        if((msj[i]==')') || (msj[i]=='}')){
            Paren_Llav.pop();
            correcto = true;
            break;
        } //cierre de Parentesis/llave
    } catch (EmptySTackException pilaVacia) {
        correcto = false;
        break;
    }
}

//Comprobaciones individuales

if(Paren_Llav.size() != 0){
    correcto = false
}

if(correcto=false){
    txtLog.setText(txtLog.getText()+"Error Semántico! \t Desbalanceo de Parentesis\n");
    txt_notificaciones.setText(txt_notificaciones.getText()+"Compilación finalizada!"\n)
    Paren_Llav.removeAllElements();
    return;
}

//Aplicación del algoritmo de conversión de notación infija a Postfija, como se vio en la Act 4.
public String aPostFijo(String infijo) {
    String salida = "";
    char[] cadena = infijo.toCharArray();
    for (int c = 0; c < cadena.length; c++) {
        char caracter = cadena[c]
        if (Character.isDigit(caracter)) {
            salida += " " + caracter;
            c++;
            busqueda:
            for (; c < cadena.length; c++) {
                if (Character.isDigit(cadena[c])) {
                salida += cadena[c];
                } else {
                    c--;
                    break busqueda;
                }
            }
        } else if (caracter == '+' || caracter == '-' || caracter == '/' || caracter == '*') {
            if (Paren_Llav.empty()) {
            Paren_Llav.push(caracter);
            } else {
                while (true) {
                    if (Ev_Precedencia(caracter)) {
                        Paren_Llav.push(caracter);
                        break;
                    } else {
                        salida += " " + Paren_Llav.pop();
                    }
                } // fin del while
            }
        } else {
            errores = errores + "Error Sintactico " + contador_errores + ". caracter inválido para la
            expresión : '" + caracter + "' \n";
            contador_errores++;
            return null;
        }
    }//fin del for
    if (!Paren_Llav.empty()) {
        do {
        char temp = Paren_Llav.pop().charValue();
        salida += " " + temp;
        } while (!Paren_Llav.empty());
        }
        return salida.trim();
} // fin del método

//Evaluador de la precedencia de los caracteres! (clase auxiliar)
public boolean Ev_Precedencia(char caracter) {
    if (Paren_Llav.empty()) {
    return true;
    }
    if (caracter == Paren_Llav.peek().charValue()) {
        return false;
    }
    if ((caracter == '*' && Paren_Llav.peek().charValue() == '/') || (caracter == '/' && Paren_Llav.peek().charValue() == '*')) {
        return false;
    }
    if ((caracter == '+' && Paren_Llav.peek().charValue() == '-') || (caracter == '-' && Paren_Llav.peek().charValue() == '+')) {
        return false;
    } else if (caracter == '-' || caracter == '+') {
        char temp = Paren_Llav.peek().charValue();
        if (temp == '*' || temp == '/') {
            return false;
        }
    }
    return true;
}


public int Ev_Postfijo(String posfijo) {
    ArrayList<String> token = new ArrayList<String>();
    StringTokenizer st = new StringTokenizer(posfijo, " ");
    while (st.hasMoreTokens()) {
    token.add(st.nextToken());
    }
    if (token.size() == 1) {
        return Integer.parseInt(token.get(0));
        }
        int c = 0;
        while (token.size() != 1) {
            String operador = token.get(c);
            if (operador.equals("+") || operador.equals("-") || operador.equals("*") ||
                operador.equals("/")) {
                String operando1 = token.get(c - 1);
                String operando2 = token.get(c - 2);
                token.remove(c);
                token.remove(c - 1);
                token.remove(c - 2);
                if (operador.equals("+")) {
                    try {
                        String suma = (Integer.parseInt(operando2) + Integer.parseInt(operando1)) + "";
                        token.add(c - 2, suma);
                        c = 0;
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                } else if (operador.equals("-")) {
                    try {
                        String resta = (Integer.parseInt(operando2) - Integer.parseInt(operando1)) + "";
                        token.add(c - 2, resta);
                        c = 0;
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                } else if (operador.equals("*")) {
                    try {
                        String multiplicacion = (Integer.parseInt(operando2) * Integer.parseInt(operando1)) +
                        "";
                        token.add(c - 2, multiplicacion);
                        c = 0;
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                } else if (operador.equals("/")) {
                    try {
                        String division = (Integer.parseInt(operando2) / Integer.parseInt(operando1)) + "";
                        token.add(c - 2, division);
                        c = 0;
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                } else {
                    c++;
                }
            }
            try {
                return Integer.parseInt(token.get(0));
            } catch (NumberFormatException e) {
                return 0;
            }
    }
}



public class PruebaTiempo{
    public static void main(String[] args) throws
    InterruptedException {
        long inicio = System.currentTimeMillis();
        Thread.sleep(2000);
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" segundos");
        }
    }
}
    