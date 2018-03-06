
package javacc;

import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class semantico {
    
//variable, int palabra reservada (id)
    
    public static boolean x= true;
    private static Hashtable <String,Integer> tabla = new Hashtable<String,Integer>();
    static JTextArea aa;
    
    public semantico(JTextArea aa)
    {
        this.aa = aa;
    }
   
            
    public static void limpiarTabla(){
    
    tabla.clear();
    }
    
    
    public static void guardarvariable(Token tk){
    
       
        
        
        if(tabla.get(tk.image)!=null){
            if(tabla.get(tk.image)!=null){
aa.setText(aa.getText() + "Variabe "+tk.image+" duplicada en la linea:"+tk.beginLine+ "\n");       
    }
            else{
            aa.setText(aa.getText()+"");
            }
}        

    else{
        
     tabla.put(tk.image, tk.kind);  
    // aa.setText(aa.getText()+null);
    //aa.setText(aa.getText()+"La variaable "+tk.image+" ha sido declarada");
      
    }
    do{
        aa.setText(aa.getText());
       
    }while(tabla.get(tk.image)==null);
        
    }//LLAVE DEL TOKEN
    
    public static void variableInex(Token tk){
        try{ int x = tabla.get(tk.image);
        
        }catch(Exception e){
           System.err.print("\nError, la variable "+ tk.image +" no existe, Linea:"+tk.beginLine);
            aa.setText(aa.getText() + "Error, la variable "+ tk.image +" no existe, Linea:"+tk.beginLine+ "\n");
       // JOptionPane.showMessageDialog(null,"Error, la variable "+ tk.image +" no existe, Linea:"+tk.beginLine,"ERROR SEMANTICO", JOptionPane.ERROR_MESSAGE);
        }
        
    
    
    }
    
    
    
}
