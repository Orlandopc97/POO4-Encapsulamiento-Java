//Clase alumno
public class Alumno {


    //ATRIBUTOS(caracteristicas) de la clase(objeto)
    //Variables globales

    //*******+++++++POR ESTANDAR TODOS LOS ATRIBUTOS DE UNA CLASE DEBEN SER PRIVADOS ++++++++++***
    /*
    PARA PROTEGERLOS DE QUE NO CUALQUIER OTRA CLASE PUEDA ACCEDER A ELLOS Y NOS OBLIGUE A
    UTILIZAR LOS METODOS GETTERS Y SETTERS PARA PODER ESTABLECER LOS VALORES
    */
    //TIPO DE ACCESO PRIVATE
    private int id;
    private String nombre;
    private String apellido;


    //METODOS CONSTRUCTORES
    //CONSTRUCTOR VACIO (Se utiliza cuando se crea un objeto que los datos se llenan mas adelante)
    public Alumno(){

    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    //Variables locales
    public Alumno(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }



    //METODOS GETTERS AND SETTERS
    //METODO GETTER (Traer) // Obtener los datos para hacer una operacion, mostrarlos por pantalla
    public int getId(){
        return id;
    }
    //METODO SETTER (Colocar) // Se puede colocar o establecer valores a cada atributo
    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }


    //*******+++++++ALGUNOS METODOS DEPENDE DEL ANALISIS, DEBEN SER PUBLICOS,PRIVADOS O PROTEGIDOS ++++++++++***
    //METODOS
    //modificador de acceso
    //tipo de dato a devolver
    //nombre del metodo(verbo en infinitivo)
    public void mostrarNombre (){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    //Metodo
    public void saberAprobado(double calificacion){
        if (calificacion >= 6){
            System.out.println("Aprobé la materia");
        }else{
            System.out.println("Uyy, no aprobe la materia");
        }
    }
}

/*

ATRIBUTOS: Son las caracteristicas o datos que describen el estado de un objeto en un contexto determinado
        -Pueden representar desde valores simples como numeros o cadenas de texto,
         hasta estructuras mas complejas como Objetos y otros tipos de datos.


METODOS:
        -Son acciones contenidas en una clase, y definen su comportamiento.
        -Son bloques de codigo que encapsulan una seria de acciones o comportamietos especificos
         asociados a un objeto.
        -Dentro de un sistema suelen detectarse como VERBOS EN INFINITIVO (terminan en ar, er, ir).
        -Los metodos permiten realizar operaciones sobre los datos de un objeto, modificar su estado interno
         y responder a eventos dentro de un programa.
        -Los metodos pueden acceder a los atributos de un objeto.
        -Pueden tener opcionalmente valores de entrada (parametros) y valores de salida (valores de retorno).
        -Pueden existir Procedimientos (no retornan un valor) y Funciones (retornan un valor).


    METODOS CONSTRUCTORES:
        -Son funciones especiales que contienen las clases para emitir la creacion de objetos.
        -Pueden recibir datos/parámetros como no (constructor vacio).
        -Se llaman SIEMPRE IGUAL que la clase.
        -No retorna NINGÚN VALOR (ni siquiera void).
        -Generalmente se utilizan dos tipos de constructores:
            >CONSTRUCTOR VACÍO
            >CONSTRUCTOR CON TODOS LOS PARÁMETROS

    METODOS GETTERS AND SETTERS:
        -Son metodos especiales que nos permiten traer los valores de cada uno de los atributos que tengamos de una clase.
        -Sirven en los casos de crear un objeto vacio, o se quiera modificar un valor del atributo del objeto (SET).
        -GEt puede ver los datos.
        -SET puede setearlos o modificarlos si ya existia un valor cargado.
*/