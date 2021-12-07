/* The following code was generated by JFlex 1.4.3 on 6/12/21 20:31 */

package analizador_sintactico;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/12/21 20:31 from the specification file
 * <tt>C:/Feed-IT/Feed-IT/src/analizador_sintactico/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3, 29,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 37, 44, 28,  0, 35,  0,  0, 38, 39, 34, 32,  3, 33, 43, 30, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 42, 36, 31, 36,  0, 
     0,  1, 25,  1,  1, 24,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  1, 
     0,  5, 17, 21, 15, 18,  9, 14, 19,  6, 22, 26, 10,  4,  7, 11, 
    20,  1, 13, 12,  8, 16,  1, 27,  1,  1, 23, 40,  0, 41,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\21\2\2\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\1\1\14"+
    "\1\15\1\16\1\17\1\20\2\1\1\0\3\2\1\21"+
    "\15\2\1\22\2\2\1\23\10\2\1\0\1\13\1\0"+
    "\1\24\1\25\1\26\1\27\1\0\1\30\1\2\1\31"+
    "\1\32\1\33\10\2\1\34\1\35\17\2\1\0\1\36"+
    "\1\37\1\40\1\41\4\2\1\42\4\2\1\43\4\2"+
    "\1\44\1\2\1\45\5\2\1\46\1\47\1\50\12\2"+
    "\1\51\1\52\1\53\3\2\1\54\1\2\1\55\1\56"+
    "\1\57\2\2\1\60\1\61\1\62\1\63\1\2\1\64"+
    "\1\65\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\u02a3"+
    "\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1\0\u03de\0\55"+
    "\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf\0\55\0\u0438\0\u0438"+
    "\0\55\0\55\0\55\0\55\0\55\0\u04ec\0\u0519\0\u04ec"+
    "\0\u0546\0\u0573\0\u05a0\0\132\0\u05cd\0\u05fa\0\u0627\0\u0654"+
    "\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f\0\u07bc"+
    "\0\u07e9\0\132\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7"+
    "\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\55\0\u0a32"+
    "\0\55\0\55\0\55\0\u04ec\0\u0519\0\u0519\0\u0a5f\0\132"+
    "\0\132\0\132\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d"+
    "\0\u0b9a\0\u0bc7\0\u0bf4\0\132\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8"+
    "\0\u0cd5\0\u0d02\0\u0d2f\0\u0d5c\0\u0d89\0\u0db6\0\u0de3\0\u0e10"+
    "\0\u0e3d\0\u0e6a\0\u0e97\0\u0ec4\0\132\0\132\0\132\0\132"+
    "\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\132\0\u0fa5\0\u0fd2\0\u0fff"+
    "\0\u102c\0\132\0\u1059\0\u1086\0\u10b3\0\u10e0\0\132\0\u110d"+
    "\0\132\0\u113a\0\u1167\0\u1194\0\u11c1\0\u11ee\0\132\0\132"+
    "\0\132\0\u121b\0\u1248\0\u1275\0\u12a2\0\u12cf\0\u12fc\0\u1329"+
    "\0\u1356\0\u1383\0\u13b0\0\132\0\132\0\132\0\u13dd\0\u140a"+
    "\0\u1437\0\132\0\u1464\0\132\0\132\0\132\0\u1491\0\u14be"+
    "\0\132\0\132\0\132\0\132\0\u14eb\0\132\0\132\0\132";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\3\1\17\1\20"+
    "\1\3\1\21\1\22\1\23\1\24\1\25\5\3\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\56\0\2\3\1\0\30\3\23\0\1\4\50\0"+
    "\1\50\4\0\1\5\52\0\2\3\1\0\1\3\1\51"+
    "\26\3\22\0\2\3\1\0\3\3\1\52\24\3\22\0"+
    "\2\3\1\0\3\3\1\53\1\3\1\54\22\3\22\0"+
    "\2\3\1\0\7\3\1\55\4\3\1\56\13\3\22\0"+
    "\2\3\1\0\2\3\1\57\6\3\1\60\16\3\22\0"+
    "\2\3\1\0\1\61\1\62\4\3\1\63\1\64\4\3"+
    "\1\65\3\3\1\66\1\67\1\70\5\3\22\0\2\3"+
    "\1\0\7\3\1\71\20\3\22\0\2\3\1\0\11\3"+
    "\1\72\16\3\22\0\2\3\1\0\4\3\1\73\23\3"+
    "\22\0\2\3\1\0\7\3\1\74\20\3\22\0\2\3"+
    "\1\0\7\3\1\75\20\3\22\0\2\3\1\0\7\3"+
    "\1\76\20\3\22\0\2\3\1\0\6\3\1\77\21\3"+
    "\22\0\2\3\1\0\14\3\1\100\13\3\22\0\2\3"+
    "\1\0\16\3\1\101\11\3\22\0\2\3\1\0\1\3"+
    "\1\102\4\3\1\103\1\104\20\3\22\0\2\3\1\0"+
    "\17\3\1\105\10\3\21\0\35\27\1\0\17\27\34\0"+
    "\1\106\57\0\1\107\17\0\1\110\35\0\1\111\12\0"+
    "\1\50\3\0\1\4\36\0\1\112\11\0\1\50\43\0"+
    "\1\113\14\0\1\114\52\0\35\115\1\0\16\115\1\116"+
    "\1\0\2\3\1\0\2\3\1\117\25\3\22\0\2\3"+
    "\1\0\13\3\1\120\14\3\22\0\2\3\1\0\4\3"+
    "\1\121\23\3\22\0\2\3\1\0\4\3\1\122\23\3"+
    "\22\0\2\3\1\0\6\3\1\123\21\3\22\0\2\3"+
    "\1\0\1\124\27\3\22\0\2\3\1\0\14\3\1\125"+
    "\13\3\22\0\2\3\1\0\1\3\1\126\26\3\22\0"+
    "\2\3\1\0\6\3\1\127\3\3\1\130\15\3\22\0"+
    "\2\3\1\0\7\3\1\131\4\3\1\132\13\3\22\0"+
    "\2\3\1\0\11\3\1\133\16\3\22\0\2\3\1\0"+
    "\3\3\1\134\24\3\22\0\2\3\1\0\11\3\1\135"+
    "\16\3\22\0\2\3\1\0\7\3\1\136\20\3\22\0"+
    "\2\3\1\0\14\3\1\137\13\3\22\0\2\3\1\0"+
    "\7\3\1\140\20\3\22\0\2\3\1\0\11\3\1\141"+
    "\16\3\22\0\2\3\1\0\25\3\1\142\2\3\22\0"+
    "\2\3\1\0\14\3\1\143\13\3\22\0\2\3\1\0"+
    "\7\3\1\144\20\3\22\0\2\3\1\0\10\3\1\145"+
    "\17\3\22\0\2\3\1\0\1\146\27\3\22\0\2\3"+
    "\1\0\10\3\1\147\17\3\22\0\2\3\1\0\3\3"+
    "\1\150\24\3\22\0\2\3\1\0\1\3\1\151\26\3"+
    "\22\0\2\3\1\0\3\3\1\152\24\3\22\0\2\3"+
    "\1\0\2\3\1\153\25\3\21\0\34\106\1\154\20\106"+
    "\2\0\1\110\50\0\1\50\2\0\2\3\1\0\3\3"+
    "\1\155\24\3\22\0\2\3\1\0\6\3\1\156\21\3"+
    "\22\0\2\3\1\0\16\3\1\157\11\3\22\0\2\3"+
    "\1\0\16\3\1\160\11\3\22\0\2\3\1\0\10\3"+
    "\1\161\17\3\22\0\2\3\1\0\10\3\1\162\17\3"+
    "\22\0\2\3\1\0\14\3\1\163\13\3\22\0\2\3"+
    "\1\0\1\3\1\164\26\3\22\0\2\3\1\0\23\3"+
    "\1\165\4\3\22\0\2\3\1\0\24\3\1\166\3\3"+
    "\22\0\2\3\1\0\16\3\1\167\11\3\22\0\2\3"+
    "\1\0\1\170\27\3\22\0\2\3\1\0\12\3\1\171"+
    "\15\3\22\0\2\3\1\0\20\3\1\172\7\3\22\0"+
    "\2\3\1\0\2\3\1\173\25\3\22\0\2\3\1\0"+
    "\1\3\1\174\26\3\22\0\2\3\1\0\15\3\1\175"+
    "\12\3\22\0\2\3\1\0\6\3\1\176\21\3\22\0"+
    "\2\3\1\0\16\3\1\177\11\3\22\0\2\3\1\0"+
    "\16\3\1\200\11\3\22\0\2\3\1\0\7\3\1\201"+
    "\20\3\22\0\2\3\1\0\13\3\1\202\14\3\22\0"+
    "\2\3\1\0\10\3\1\203\17\3\22\0\2\3\1\0"+
    "\10\3\1\204\17\3\22\0\2\3\1\0\6\3\1\205"+
    "\21\3\21\0\34\106\1\154\1\106\1\30\16\106\1\0"+
    "\2\3\1\0\1\3\1\206\26\3\22\0\2\3\1\0"+
    "\16\3\1\207\11\3\22\0\2\3\1\0\1\3\1\210"+
    "\26\3\22\0\2\3\1\0\4\3\1\211\23\3\22\0"+
    "\2\3\1\0\1\3\1\212\26\3\22\0\2\3\1\0"+
    "\1\213\27\3\22\0\2\3\1\0\16\3\1\214\11\3"+
    "\22\0\2\3\1\0\14\3\1\215\13\3\22\0\2\3"+
    "\1\0\3\3\1\216\24\3\22\0\2\3\1\0\21\3"+
    "\1\217\6\3\22\0\2\3\1\0\6\3\1\220\21\3"+
    "\22\0\2\3\1\0\16\3\1\221\11\3\22\0\2\3"+
    "\1\0\13\3\1\222\14\3\22\0\2\3\1\0\2\3"+
    "\1\223\25\3\22\0\2\3\1\0\10\3\1\224\17\3"+
    "\22\0\2\3\1\0\4\3\1\225\23\3\22\0\2\3"+
    "\1\0\16\3\1\226\11\3\22\0\2\3\1\0\22\3"+
    "\1\227\5\3\22\0\2\3\1\0\21\3\1\230\6\3"+
    "\22\0\2\3\1\0\2\3\1\231\25\3\22\0\2\3"+
    "\1\0\11\3\1\232\16\3\22\0\2\3\1\0\16\3"+
    "\1\233\11\3\22\0\2\3\1\0\12\3\1\234\15\3"+
    "\22\0\2\3\1\0\26\3\1\235\1\3\22\0\2\3"+
    "\1\0\16\3\1\236\11\3\22\0\2\3\1\0\1\3"+
    "\1\237\26\3\22\0\2\3\1\0\1\3\1\240\26\3"+
    "\22\0\2\3\1\0\6\3\1\241\21\3\22\0\2\3"+
    "\1\0\16\3\1\242\11\3\22\0\2\3\1\0\17\3"+
    "\1\243\10\3\22\0\2\3\1\0\7\3\1\244\20\3"+
    "\22\0\2\3\1\0\4\3\1\245\23\3\22\0\2\3"+
    "\1\0\3\3\1\246\24\3\22\0\2\3\1\0\13\3"+
    "\1\247\14\3\22\0\2\3\1\0\16\3\1\250\11\3"+
    "\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5400];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\25\1\1\11\5\1\1\11\2\1\5\11"+
    "\2\1\1\0\35\1\1\0\1\11\1\0\3\11\1\1"+
    "\1\0\36\1\1\0\74\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 54: 
          { return new Symbol(sym.Fjuguete, yychar, yyline, yytext());
          }
        case 55: break;
        case 26: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 56: break;
        case 50: 
          { return new Symbol(sym.ForEach, yychar, yyline, yytext());
          }
        case 57: break;
        case 41: 
          { return new Symbol(sym.Class, yychar, yyline, yytext());
          }
        case 58: break;
        case 13: 
          { return new Symbol(sym.Parentesis_C, yychar, yyline, yytext());
          }
        case 59: break;
        case 36: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 60: break;
        case 32: 
          { return new Symbol(sym.Time, yychar, yyline, yytext());
          }
        case 61: break;
        case 51: 
          { return new Symbol(sym.Fpremio, yychar, yyline, yytext());
          }
        case 62: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 63: break;
        case 16: 
          { return new Symbol(sym.P_coma,  yychar, yyline, yytext());
          }
        case 64: break;
        case 19: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 65: break;
        case 3: 
          { return new Symbol(sym.Numero,  yychar, yyline, yytext());
          }
        case 66: break;
        case 42: 
          { return new Symbol(sym.Const, yychar, yyline, yytext());
          }
        case 67: break;
        case 52: 
          { return new Symbol(sym.Boolean, yychar, yyline, yytext());
          }
        case 68: break;
        case 21: 
          { return new Symbol(sym.Dec, yychar, yyline, yytext());
          }
        case 69: break;
        case 28: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 70: break;
        case 8: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 71: break;
        case 45: 
          { return new Symbol(sym.String, yychar, yyline, yytext());
          }
        case 72: break;
        case 27: 
          { return new Symbol(sym.Not, yychar, yyline, yytext());
          }
        case 73: break;
        case 31: 
          { return new Symbol(sym.Null, yychar, yyline, yytext());
          }
        case 74: break;
        case 39: 
          { return new Symbol(sym.Fagua, yychar, yyline, yytext());
          }
        case 75: break;
        case 11: 
          { return new Symbol(sym.OpR, yychar, yyline, yytext());
          }
        case 76: break;
        case 24: 
          { return new Symbol(sym.Texto,  yychar, yyline, yytext());
          }
        case 77: break;
        case 10: 
          { return new Symbol(sym.Modulo, yychar, yyline, yytext());
          }
        case 78: break;
        case 14: 
          { return new Symbol(sym.Llave_A, yychar, yyline, yytext());
          }
        case 79: break;
        case 17: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 80: break;
        case 25: 
          { return new Symbol(sym.And, yychar, yyline, yytext());
          }
        case 81: break;
        case 46: 
          { return new Symbol(sym.GoBack, yychar, yyline, yytext());
          }
        case 82: break;
        case 47: 
          { return new Symbol(sym.Double, yychar, yyline, yytext());
          }
        case 83: break;
        case 20: 
          { return new Symbol(sym.Inc, yychar, yyline, yytext());
          }
        case 84: break;
        case 30: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 85: break;
        case 37: 
          { return new Symbol(sym.Peso, yychar, yyline, yytext());
          }
        case 86: break;
        case 35: 
          { return new Symbol(sym.Loop, yychar, yyline, yytext());
          }
        case 87: break;
        case 22: 
          { return new Symbol(sym.Potencia, yychar, yyline, yytext());
          }
        case 88: break;
        case 48: 
          { return new Symbol(sym.Candil, yychar, yyline, yytext());
          }
        case 89: break;
        case 12: 
          { return new Symbol(sym.Parentesis_A, yychar, yyline, yytext());
          }
        case 90: break;
        case 9: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 91: break;
        case 34: 
          { return new Symbol(sym.Fluz, yychar, yyline, yytext());
          }
        case 92: break;
        case 7: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 93: break;
        case 6: 
          { return new Symbol(sym.Asignacion, yychar, yyline, yytext());
          }
        case 94: break;
        case 49: 
          { return new Symbol(sym.Fmasaje, yychar, yyline, yytext());
          }
        case 95: break;
        case 44: 
          { return new Symbol(sym.Fcomer, yychar, yyline, yytext());
          }
        case 96: break;
        case 23: 
          { return new Symbol(sym.Flotante,  yychar, yyline, yytext());
          }
        case 97: break;
        case 38: 
          { return new Symbol(sym.False, yychar, yyline, yytext());
          }
        case 98: break;
        case 15: 
          { return new Symbol(sym.Llave_C, yychar, yyline, yytext());
          }
        case 99: break;
        case 43: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 100: break;
        case 18: 
          { return new Symbol(sym.Or, yychar, yyline, yytext());
          }
        case 101: break;
        case 29: 
          { return new Symbol(sym.Fun, yychar, yyline, yytext());
          }
        case 102: break;
        case 1: 
          { return new Symbol(sym.ERROR,  yychar, yyline, yytext());
          }
        case 103: break;
        case 4: 
          { /*Ignore*/
          }
        case 104: break;
        case 33: 
          { return new Symbol(sym.True, yychar, yyline, yytext());
          }
        case 105: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 106: break;
        case 53: 
          { return new Symbol(sym.Humedad, yychar, yyline, yytext());
          }
        case 107: break;
        case 40: 
          { return new Symbol(sym.Float, yychar, yyline, yytext());
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
