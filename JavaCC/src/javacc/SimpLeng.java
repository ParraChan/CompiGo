/* SimpLeng.java */
/* Generated By:JavaCC: Do not edit this line. SimpLeng.java */
package javacc;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SimpLeng implements SimpLengConstants {


boolean Menosshort = false; //Salida resumida falso
String resultado = "";

//#################################################################
semantico semanticopo;

public void setTextArea(JTextArea text)
{
    semanticopo= new semantico(text);
}
//##################################################################


public void procesar() throws Exception{
Token t = new Token ();
resultado="";

do {
t = getNextToken(); //Obtiene el proximo token
String nomeToken = tokenImage[t.kind]; //Guardar nombre del token en String
resultado=resultado+t.image;
switch(t.kind){
    case 0:
        resultado=resultado+"\u005cn";
    break;
    case 5:
        resultado=resultado+",PR_Pkg\u005cn";
    break;
    case 6:
        resultado=resultado+",PR_Mn\u005cn";
    break;
    case 7:
        resultado=resultado+",PR_imp\u005cn";
    break;
    case 8:
        resultado=resultado+",PR_DV\u005cn";
    break;
    case 9:
        resultado=resultado+",PR_fmt\u005cn";
    break;
    case 10:
        resultado=resultado+",PR_Scan\u005cn";
    break;
    case 11:
        resultado=resultado+",PR_print\u005cn";
    break;
    case 12:
        resultado=resultado+",PR_If\u005cn";
    break;
    case 13:
        resultado=resultado+",PR_Else\u005cn";
    break;
    case 14:
        resultado=resultado+",PR_For\u005cn";
    break;
    case 15:
        resultado=resultado+",PR_Return\u005cn";
    break;
    case 16:
        resultado=resultado+",PR_Funcion\u005cn";
    break;
    case 17:
        resultado=resultado+",D_ParentI\u005cn";
    break;
    case 18:
        resultado=resultado+",D_ParentD\u005cn";
    break;
    case 19:
        resultado=resultado+",D_CorchI\u005cn";
    break;
    case 20:
        resultado=resultado+",D_CorchD\u005cn";
    break;
    case 21:
        resultado=resultado+",D_LlaveI\u005cn";
    break;
    case 22:
        resultado=resultado+",D_LlaveD\u005cn";
    break;
    case 23:
        resultado=resultado+",D_Coma\u005cn";
    break;
    case 24:
        resultado=resultado+",OC_Mas\u005cn";
    break;
    case 25:
        resultado=resultado+",OC_Menos\u005cn";
    break;
    case 26:
        resultado=resultado+",OC_Por\u005cn";
    break;
    case 27:
        resultado=resultado+",OC_Entre\u005cn";
    break;
    case 28:
        resultado=resultado+",OC_Menor\u005cn";
    break;
    case 29:
        resultado=resultado+",OC_Mayor\u005cn";
    break;
    case 30:
        resultado=resultado+",OC_MenorI\u005cn";
    break;
    case 31:
        resultado=resultado+",OC_MayorI\u005cn";
    break;
    case 32:
        resultado=resultado+",OC_Asignar\u005cn";
    break;
    case 33:
        resultado=resultado+",OC_Diferente\u005cn";
    break;
    case 34:
        resultado=resultado+",OC_Punto\u005cn";
    break;
    case 35:
        resultado=resultado+",OC_Comilla\u005cn";
    break;
    case 36:
        resultado=resultado+",OC_Comilla\u005cn";
    break;
    case 37:
        resultado=resultado+",OC_Igual\u005cn";
    break;
    case 38:
        resultado=resultado+",OC_Increm\u005cn";
    break;
    case 39:
        resultado=resultado+",OC_Decrem\u005cn";
    break;
    case 40:
        resultado=resultado+",OC_PuntCom\u005cn";
    break;
    case 41:
        resultado=resultado+",OC_Espace\u005cn";
    break;
    case 42:
        resultado=resultado+",PR_true\u005cn";
    break;
    case 43:
        resultado=resultado+",PR_false\u005cn";
    break;
    case 44:
        resultado=resultado+",T_Int\u005cn";
    break;
    case 45:
        resultado=resultado+",T_Float\u005cn";
    break;
    case 46:
        resultado=resultado+",T_String\u005cn";
    break;
    case 47:
        resultado=resultado+",T_Bool\u005cn";
    break;
    case 48:
        resultado=resultado+",S_admiI\u005cn";
    break;
    case 49:
        resultado=resultado+",S_admiD\u005cn";
    break;
    case 50:
        resultado=resultado+",S_gato\u005cn";
    break;
    case 51:
        resultado=resultado+",S_pesos\u005cn";
    break;
    case 52:
        resultado=resultado+",S_and\u005cn";
    break;
    case 53:
        resultado=resultado+",S_interrogaI\u005cn";
    break;
    case 54:
        resultado=resultado+",S_interrogaD\u005cn";
    break;
    case 58:
        resultado=resultado+",Number\u005cn";
    break;
    case 59:
        resultado=resultado+",Constante\u005cn";
    break;
    case 60:
        resultado=resultado+",Variable\u005cn";
    break;
    case 61:
        resultado=resultado+",String\u005cn";
    break;


}
} while(t.kind!=0); //Condicion de parada: Final del archivo (constante eof 0 )
}

public static void main(String args[], String x) throws ParseException, FileNotFoundException {
try {
}catch (Error e){
System.out.println(e.getMessage()); //Mensaje de error lexico
}
}

  final public void prog() throws ParseException {semantico.limpiarTabla();
    try {
      jj_consume_token(PR_Pkg);
      jj_consume_token(PR_Mn);
      label_1:
      while (true) {
        imp();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PR_imp:{
          ;
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
      }
      jj_consume_token(PR_Funcion);
      jj_consume_token(PR_Mn);
      jj_consume_token(D_ParentI);
      jj_consume_token(D_ParentD);
      jj_consume_token(D_LlaveI);
      label_2:
      while (true) {
        sentencia();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PR_DV:
        case PR_fmt:
        case PR_If:
        case PR_For:
        case Variable:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
      }
      jj_consume_token(D_LlaveD);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PR_Funcion:{
          ;
          break;
          }
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
        funcion();
      }
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != OC_PuntCom && t!=null && t.kind != EOF);
    }
  }

  final public void imp() throws ParseException {
    try {
      jj_consume_token(PR_imp);
      jj_consume_token(OC_Comilla);
      jj_consume_token(PR_fmt);
      jj_consume_token(OC_Comilla);
      PuntoComa();
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind !=OC_PuntCom  && t!=null && t.kind != EOF);
    }
  }

  final public void funcion() throws ParseException {
    try {
      jj_consume_token(PR_Funcion);
      jj_consume_token(Variable);
      jj_consume_token(D_ParentI);
      jj_consume_token(D_ParentD);
      jj_consume_token(D_LlaveI);
      label_4:
      while (true) {
        sentencia();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PR_DV:
        case PR_fmt:
        case PR_If:
        case PR_For:
        case Variable:{
          ;
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          break label_4;
        }
      }
      jj_consume_token(D_LlaveD);
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != D_LlaveD && t!=null && t.kind != EOF);
    }
  }

  final public void sentencia() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PR_fmt:{
        imprimir();
        break;
        }
      case PR_DV:{
        decVar();
        break;
        }
      case PR_If:{
        CicloIF();
        break;
        }
      case Variable:{
        asignar();
        break;
        }
      case PR_For:{
        CicloFOR();
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != OC_PuntCom && t!=null && t.kind != EOF);
    }
  }

  final public void imprimir() throws ParseException {
    try {
      jj_consume_token(PR_fmt);
      jj_consume_token(OC_Punto);
      jj_consume_token(PR_print);
      jj_consume_token(D_ParentI);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Variable:{
        jj_consume_token(Variable);
semantico.variableInex(token);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case D_CorchI:{
          jj_consume_token(D_CorchI);
          jj_consume_token(Number);
          jj_consume_token(D_CorchD);
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          ;
        }
        break;
        }
      case Constante:{
        jj_consume_token(Constante);
        break;
        }
      case String:{
        jj_consume_token(String);
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case D_Coma:{
          ;
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          break label_5;
        }
        jj_consume_token(D_Coma);
        jj_consume_token(Variable);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case D_CorchI:{
          jj_consume_token(D_CorchI);
          jj_consume_token(Number);
          jj_consume_token(D_CorchD);
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          ;
        }
      }
      jj_consume_token(D_ParentD);
      PuntoComa();
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != OC_PuntCom && t!=null && t.kind != EOF);
    }
  }

  final public void decVar() throws ParseException {
    try {
      jj_consume_token(PR_DV);
      jj_consume_token(Variable);
Token tt=token;
    semanticopo.guardarvariable(tt);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case D_CorchI:{
        jj_consume_token(D_CorchI);
        jj_consume_token(Number);
        jj_consume_token(D_CorchD);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case T_Int:{
          jj_consume_token(T_Int);
          break;
          }
        case T_Float:{
          jj_consume_token(T_Float);
          break;
          }
        case T_String:{
          jj_consume_token(T_String);
          break;
          }
        case T_Bool:{
          jj_consume_token(T_Bool);
          break;
          }
        default:
          jj_la1[9] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case T_Int:{
        jj_consume_token(T_Int);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Asignar:{
          jj_consume_token(OC_Asignar);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case Number:{
            jj_consume_token(Number);
            break;
            }
          case Variable:{
            jj_consume_token(Variable);
semantico.variableInex(token);
            break;
            }
          default:
            jj_la1[10] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          ;
        }
        break;
        }
      case T_Float:{
        jj_consume_token(T_Float);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Asignar:{
          jj_consume_token(OC_Asignar);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case Constante:{
            jj_consume_token(Constante);
            break;
            }
          case Number:{
            jj_consume_token(Number);
            break;
            }
          case Variable:{
            jj_consume_token(Variable);
semantico.variableInex(token);
            break;
            }
          default:
            jj_la1[12] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[13] = jj_gen;
          ;
        }
        break;
        }
      case T_String:{
        jj_consume_token(T_String);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Asignar:{
          jj_consume_token(OC_Asignar);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case String:{
            jj_consume_token(String);
            break;
            }
          case Variable:{
            jj_consume_token(Variable);
semantico.variableInex(token);
            break;
            }
          default:
            jj_la1[14] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[15] = jj_gen;
          ;
        }
        break;
        }
      case T_Bool:{
        jj_consume_token(T_Bool);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Asignar:{
          jj_consume_token(OC_Asignar);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case PR_true:{
            jj_consume_token(PR_true);
            break;
            }
          case PR_false:{
            jj_consume_token(PR_false);
            break;
            }
          case Variable:{
            jj_consume_token(Variable);
semantico.variableInex(token);
            break;
            }
          default:
            jj_la1[16] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          break;
          }
        default:
          jj_la1[17] = jj_gen;
          ;
        }
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      PuntoComa();
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != OC_PuntCom && t!=null && t.kind != EOF);
    }
  }

  final public void asignar() throws ParseException {
    try {
      jj_consume_token(Variable);
semantico.variableInex(token);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case D_Coma:{
        jj_consume_token(D_Coma);
        jj_consume_token(Variable);
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OC_Mas:{
        jj_consume_token(OC_Mas);
        jj_consume_token(Variable);
        break;
        }
      default:
        jj_la1[20] = jj_gen;
        ;
      }
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case D_CorchI:{
          ;
          break;
          }
        default:
          jj_la1[21] = jj_gen;
          break label_6;
        }
        jj_consume_token(D_CorchI);
        jj_consume_token(Number);
        jj_consume_token(D_CorchD);
      }
      jj_consume_token(OC_Asignar);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Variable:{
        jj_consume_token(Variable);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case D_Coma:{
          jj_consume_token(D_Coma);
          jj_consume_token(Variable);
          break;
          }
        default:
          jj_la1[22] = jj_gen;
          ;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Mas:{
          jj_consume_token(OC_Mas);
          jj_consume_token(Variable);
          break;
          }
        default:
          jj_la1[23] = jj_gen;
          ;
        }
        break;
        }
      case Number:{
        jj_consume_token(Number);
        break;
        }
      case String:{
        jj_consume_token(String);
        break;
        }
      case Constante:{
        jj_consume_token(Constante);
        break;
        }
      case PR_true:{
        jj_consume_token(PR_true);
        break;
        }
      case PR_false:{
        jj_consume_token(PR_false);
        break;
        }
      default:
        jj_la1[24] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      PuntoComa();
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != OC_PuntCom && t!=null && t.kind != EOF);
    }
  }

  final public void CicloIF() throws ParseException {
    try {
      jj_consume_token(PR_If);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Number:{
        jj_consume_token(Number);
        break;
        }
      case Variable:{
        jj_consume_token(Variable);
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(OC_Espace);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OC_Mayor:{
        jj_consume_token(OC_Mayor);
        break;
        }
      case OC_MayorI:{
        jj_consume_token(OC_MayorI);
        break;
        }
      case OC_Menor:{
        jj_consume_token(OC_Menor);
        break;
        }
      case OC_MenorI:{
        jj_consume_token(OC_MenorI);
        break;
        }
      default:
        jj_la1[26] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Number:{
        jj_consume_token(Number);
        break;
        }
      case Variable:{
        jj_consume_token(Variable);
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(D_LlaveI);
      label_7:
      while (true) {
        sentencia();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PR_DV:
        case PR_fmt:
        case PR_If:
        case PR_For:
        case Variable:{
          ;
          break;
          }
        default:
          jj_la1[28] = jj_gen;
          break label_7;
        }
      }
      jj_consume_token(D_LlaveD);
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind !=D_LlaveD  && t!=null && t.kind != EOF);
    }
  }

  final public void CicloFOR() throws ParseException {
    try {
      jj_consume_token(PR_For);
      jj_consume_token(Variable);
      jj_consume_token(OC_Asignar);
      jj_consume_token(Number);
      jj_consume_token(OC_PuntCom);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Number:{
        jj_consume_token(Number);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Mayor:{
          jj_consume_token(OC_Mayor);
          break;
          }
        case OC_MayorI:{
          jj_consume_token(OC_MayorI);
          break;
          }
        case OC_Menor:{
          jj_consume_token(OC_Menor);
          break;
          }
        case OC_MenorI:{
          jj_consume_token(OC_MenorI);
          break;
          }
        default:
          jj_la1[29] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(Number);
        jj_consume_token(OC_PuntCom);
        jj_consume_token(OC_Increm);
        jj_consume_token(Variable);
        break;
        }
      case Constante:{
        jj_consume_token(Constante);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Mayor:{
          jj_consume_token(OC_Mayor);
          break;
          }
        case OC_MayorI:{
          jj_consume_token(OC_MayorI);
          break;
          }
        case OC_Menor:{
          jj_consume_token(OC_Menor);
          break;
          }
        case OC_MenorI:{
          jj_consume_token(OC_MenorI);
          break;
          }
        default:
          jj_la1[30] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(Constante);
        jj_consume_token(OC_PuntCom);
        jj_consume_token(OC_Increm);
        jj_consume_token(Constante);
        break;
        }
      case Variable:{
        jj_consume_token(Variable);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OC_Mayor:{
          jj_consume_token(OC_Mayor);
          break;
          }
        case OC_MayorI:{
          jj_consume_token(OC_MayorI);
          break;
          }
        case OC_Menor:{
          jj_consume_token(OC_Menor);
          break;
          }
        case OC_MenorI:{
          jj_consume_token(OC_MenorI);
          break;
          }
        default:
          jj_la1[31] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(Variable);
        jj_consume_token(OC_PuntCom);
        jj_consume_token(OC_Increm);
        jj_consume_token(Variable);
        break;
        }
      default:
        jj_la1[32] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(D_LlaveI);
      label_8:
      while (true) {
        sentencia();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PR_DV:
        case PR_fmt:
        case PR_If:
        case PR_For:
        case Variable:{
          ;
          break;
          }
        default:
          jj_la1[33] = jj_gen;
          break label_8;
        }
      }
      jj_consume_token(D_LlaveD);
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != D_LlaveD && t!=null && t.kind != EOF);
    }
  }

  final public void PuntoComa() throws ParseException {
    try {
      jj_consume_token(OC_PuntCom);
    } catch (ParseException e) {
Token t;
        JOptionPane.showMessageDialog(null,e.toString(),"ERROR SINTACTICO", JOptionPane.ERROR_MESSAGE);
        //System.out.println(e.toString());
        do {
            t = getNextToken();
        }while (t.kind != OC_PuntCom && t!=null && t.kind != EOF);
    }
  }

  /** Generated Token Manager. */
  public SimpLengTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[34];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x80,0x5300,0x10000,0x5300,0x5300,0x80000,0x0,0x800000,0x80000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x80000,0x800000,0x1000000,0x80000,0x800000,0x1000000,0x0,0x0,0xf0000000,0x0,0x5300,0xf0000000,0xf0000000,0xf0000000,0x0,0x5300,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x10000000,0x0,0x10000000,0x10000000,0x0,0x38000000,0x0,0x0,0xf000,0x14000000,0x1,0x1c000000,0x1,0x30000000,0x1,0x10000c00,0x1,0xf000,0x0,0x0,0x0,0x0,0x0,0x3c000c00,0x14000000,0x0,0x14000000,0x10000000,0x0,0x0,0x0,0x1c000000,0x10000000,};
   }

  /** Constructor with InputStream. */
  public SimpLeng(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SimpLeng(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SimpLengTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 34; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 34; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SimpLeng(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SimpLengTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 34; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 34; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SimpLeng(SimpLengTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 34; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SimpLengTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 34; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[62];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 34; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 62; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
