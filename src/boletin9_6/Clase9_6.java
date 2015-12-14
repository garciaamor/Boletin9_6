package boletin9_6;

import javax.swing.JOptionPane;

public class Clase9_6 {
    public float introducirsueldo(){
    return Integer.parseInt(JOptionPane.showInputDialog("Introduzca el sueldo del trabajador: "));
    }
    
public void contarsueldos(){
 int trab1=0;
 int trab2=0;
 
     float sueldo= introducirsueldo();
 do{
     if(sueldo>=1000 && sueldo <=1750)
         trab1++;
     else{
         trab2++;}
 sueldo= introducirsueldo();}
  while(sueldo!=0);
 
JOptionPane.showMessageDialog(null,"O numero de traballadores que ganan entre 1000 e 1750 euros é de: "+ trab1+"\nO porcentaxe de traballadores que ganan menos de 1000 euros é de:  "+ ((trab2*100)/(trab2+trab1))+"%");

}
 
}  

