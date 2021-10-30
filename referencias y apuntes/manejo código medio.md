Inicializar pila
Divida la cadena en token y almacenarlos en un arreglo
Realizar el recorrido del arreglo de derecha a izquierda
    Si el símbolo es un operando, haga push a la pila
    sI EL símbolo es un operador, remover dos elementos de la pila, 
    realizar la operación con los dos elementos removidos 
    hacer push del resultado 
    .
Repetir el proceso hasta que el arreglo con los tokens este vacío
Retornar el resultado del tope de la pila



Cuadruplos:

- Divide each instruction into 4 different fields: op, arg1, arg2, resultado
- the field op will be used to store the internal code of the operator
- The fields arg1 and arg2, will be used to store the two operands used
- El campo resultado se utilizará para almacenar el resultado de la expresión
- Revisar por más expresiones, en caso de no encontrar finalizar

Triplos

- divide each instruction into 3 different fields: op, arg1, arg2
- the field op will be used to store the internal code of the operator
- the fields arg1 and arg2 will be used to store both of the operand used
- el resultado se guardará de forma dinámica dependiendo de dónde se guarde y se refiera la instrucción
- revisar si existen más expresiones, en caso de no encontrar, terminar.

Código p

- tomar el siguiente contador de programa (registro PC)
- Definir el nuevo marcador al apuntador de pila en donde se almacenará la información de la operación
- Mover la información de SP a EP para obtener las variables
- Realizar la instrucción y guardarla en la pila
- Mover el puntero a NP
- Actualizar PC al nuevo punto (NP)
- finalizar al terminar la pila