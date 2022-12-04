package com.mycompany.proyectofinal;

/**
 *
 * @author Luis Alvarado aaaaaaaaa
 */
public class GrafoDirigidoAciclico{
    int vertices;
    Vertice [] todosVertices;
    int aristas=0;
    Arista aristasTodas [];
    int vActual=0;
    public GrafoDirigidoAciclico(int n)  
    {
        this.vertices = n;
        todosVertices = new Vertice[n];
        aristasTodas = new Arista[n*n];
    }
    
    
    //TERMINADO ANDREA
    public int gradoDeEntrada(int i){
        int gradoEntrada = 0;
        if(i>vertices-1||i<0){
            throw new IllegalArgumentException("i está fuera de rango");
        }else{
            for (Arista aristasToda : aristasTodas) {
                if (aristasToda!=null && aristasToda.destino.compareTo(""+i) == 0) { //compara el vertice con los detinos de todas las aristas para saber si tiene grados de entrada
                    gradoEntrada++;
                    
                }
            }
        }
        
        return gradoEntrada;
    }
    
    //TERMINADO ANDREA
    public int gradoDeSalida(int i){
        int gradoSalida = 0;
        if(i>vertices-1||i<0){
            throw new IllegalArgumentException("i está fuera de rango");
        } else{
            for (Arista aristasToda : aristasTodas) {
                if(aristasToda!=null && aristasToda.origen.compareTo(""+i)==0){//compara el vertice con los origenes de todas las aristas para saber si tiene grados de salida
                    gradoSalida++;
                }
            }
        }
        return gradoSalida;
    }
    
    //TERMINADO ANDREA
    public int cuantasAristasHay(){
        int nAristas = 0;
        for (Arista aristasToda : aristasTodas) {
            if(aristasToda!=null){
                nAristas++;
            }
        }
        return nAristas;
    }
    
    //TERMINADO ANDREA
    public boolean adyacente(int i, int j){
        boolean si = false;
        if((i>vertices-1||i<0)||(j>vertices-1||j<0)){
            throw new IllegalArgumentException("i o j están fuera de rango");
        } else{
            for (Arista aristasToda : aristasTodas) {
                if(aristasToda!=null && aristasToda.origen.compareTo(""+i)==0 && aristasToda.destino.compareTo(""+j)==0 ){
                    si = true;
                }
            }
        }
        return si;
    }
    
    public boolean conectados(int i, int j){
        boolean conect = true;
        if((j>vertices-1||j<0)){
            throw new IllegalArgumentException("j están fuera de rango");
        } else{
           
        }
        return conect;
    }
    
    public String topologicalSort(){
        String orden = "1-2-3-4-5";
        String topological="";
        
        for (int i = 0; i < todosVertices.length; i++) {
            
        }
        
        
                return orden;
    }
    
    public boolean tieneCiclos(){
        boolean tiene = true;
        return tiene;
    
    }
    
    public String mostrarEstructura(){
        String matriz = "M-A-T-R-I-Z";
        return matriz;
    }
    
    public boolean insertarArista(int i, int j){
        boolean sePudo = true;
        if((i>vertices-1||i<0)||(j>vertices-1||j<0)){
            throw new IllegalArgumentException("i o j están fuera de rango");
        }
        else
        {
            int posicionI = encontrarVertice(Integer.toString(i));
            int posicionJ = encontrarVertice(Integer.toString(j));
            if( posicionI != -1 && posicionJ !=-1)
            {
                aristasTodas[aristas]= new Arista(Integer.toString(i),Integer.toString(j));
                aristas++;
               
                
            }
            else
            {
                System.out.println("Vertice inexistente.");
            }
        }
        return sePudo;
    }
    
    public void eliminarAristas(){
    
    
    }
    
    public void insertarVertice(String nombre)
    {
        Vertice nuevoV = new Vertice(nombre);
        boolean repetido=false;
        if(vActual<vertices)
        {
            for(int i=0; i<vActual;i++)
            {
                repetido = todosVertices[i].getNombre().equals(nombre);
            }
            if(repetido==true)
            {
                System.out.println("Ya existe tal vertice.");
            }
            else
            {
                nuevoV.darPosicion(vActual);
                todosVertices[vActual] = nuevoV;
                vActual++;
            }
        }
        else
        {
            System.out.println("Ya se ingresaron el máximo de vertices");
        }
    }
    public int encontrarVertice(String nombre)
    {
        Vertice buscando=new Vertice(nombre);
        int pos=-1;
        for(int k=0;k<vActual;k++)
        {
            boolean esta = buscando.getNombre().equals(todosVertices[k].getNombre());
            if(esta==true)
            {
                pos=k;
            }
        }
        return pos;
    }
    
//     public String mostrarListaAdyacente(String nombre){
//         Vertice v=new Vertice(nombre);
//        String lista = "";
//        for (int i = 0; i < v.listaAd.size(); i++) {
//            lista += v.listaAd.get(i).toString();
//        }
//        return lista;
//    }
}
