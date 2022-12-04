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
    
    public int gradoDeEntrada(int i){
        int gradoEntrada = 1;
        if(i>vertices-1||i<0){
            throw new IllegalArgumentException("i está fuera de rango");
        }
        
        return gradoEntrada;
    }
    
    public int gradoDeSalida(int i){
        int gradoSalida = 1;
        if(i>vertices-1||i<0){
            throw new IllegalArgumentException("i está fuera de rango");
        }
        return gradoSalida;
    }
    
    public int cuantasAristasHay(){
        int nAristas = 1;
        return nAristas;
    }
    
    public boolean adyacente(int i, int j){
        boolean si = true;
        if((i>vertices-1||i<0)||(j>vertices-1||j<0)){
            throw new IllegalArgumentException("i o j están fuera de rango");
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
            if( posicionI != 1 && posicionJ !=-1)
            {
                aristasTodas[aristas]= new Arista(Integer.toString(i),Integer.toString(j));
                aristas++;
               //extra andrea prueba con lista adyacente (clase)
               Arista ij = new Arista(Integer.toString(i),Integer.toString(j));
               todosVertices[posicionI].listaAd.addFirst(ij);
                
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
