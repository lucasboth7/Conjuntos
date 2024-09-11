import java.util.Set; //interface
import java.util.HashSet; //classe, a ordem é conforme ele foi adicionado 
import java.util.LinkedHashSet; //classe
import java.util.TreeSet; //classe, ordenado em ordem alfabetica

public class Conjuntos {
    public static void main(String[] args){
        
        Set< String> TG = new HashSet();
        TG.add("Fabiana");
        TG.add("Debora Lima");
        TG.add("Fernanda");
        
        Set< String> TR = new LinkedHashSet();
        TR.add("Raquel Martins");
        TR.add("Raquel Cristina");
        TR.add("Marta");
        
        Set< String> GE = new TreeSet();
        GE.add("Fernanda");
        GE.add("Fabiana");
        
        Set<String> JF = new TreeSet();
        JF.add("Debora Lima");
        JF.add("Adriana");
        JF.add("Raquel Martins");
        JF.add("Debora Magaldi");
        
        Set<String> GEuJF = new HashSet();
        Set<String> JFiTR = new HashSet();
        boolean GEcTR;
        Set<String> TG_GE = new HashSet();
        Set<String> TGdsJF = new HashSet();
        
        System.out.println("União dos Conjuntos: ");
        GEuJF.addAll(GE);
        GEuJF.addAll(JF);
        for(String elemento : GEuJF){
            System.out.println(elemento);
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Interseção de conujuntos: ");
        JFiTR.addAll(JF);
        JFiTR.retainAll(TR);
        
        for(String elemento: JFiTR){
            System.out.println(elemento);
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Esta contido de conjuntos:");
        GEcTG = TG.containsAll(GE);
        System.out.println(GEcTG);
        
        System.out.println("Diferença de conjuntos: ");
        TG_GE.addAll(TG);
        
        Set<String> temp = new HashSet();
        temp.retainAll(GE);
        
        TG_GE.removeAll(temp);
        
        for( String elemento : TG){
            System.out.println(elemento);
        }
        
    }
}
