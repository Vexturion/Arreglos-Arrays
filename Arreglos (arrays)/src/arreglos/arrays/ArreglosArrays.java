package arreglos.arrays;

public class ArreglosArrays {

    public static void main(String[] args) {

    // los arreglos son estructuras de datos que nos permiten almacenar un conjunto de datos del mismo tipo
    // una vez definida la longitud del arreglo no podra modificarse en tiempo de ejecucion
    // los datos en un arreglo poseen un indice
    // pueden ser de muchas dimensiones
        
    String nombres[];  // en java los arreglos se definen con [] y ponemos el tipo de dato que queremos almacenar al principio
    nombres = new String [3];  // asi inicializamos nuestro arreglo, en numero define el tamaño del arreglo. Sus indices serian 0,1,2. 
    // los arreglos siempre se inicializan desde el numero 0; un arreglo [5] tendra indices 0,1,2,3,4
    
    // asignacion de valores a los indices
    nombres[0]= "Pepe";  // agregamos un valor al indice 0 de nombres
    nombres[0]= "Alejandro";  // modificamos el valor antes establecido en nuestro indice 0

    nombres[1]= "Ivy";
    nombres[2]= "Mama";
    
    // lectura de arreglos
    System.out.println(nombres[0]);
    System.out.println(nombres[1]);
    System.out.println(nombres[2]);
    
    // hay mas formas en las que podemos declarar arreglos
    String nombres2[] = new String[3];  // asi podemos declarar un arreglo en una sola linea
    // String nombres[];
    // nombres = new String [3];  // hacerlo de esta forma nos ahorra esas dos lineas de codigo
    // y asignamos valores
    nombres2[0]= "Alejandro 2";
    nombres2[1]= "Ivy 2";
    nombres2[2]= "Mama 2";
    
    System.out.println(nombres2[0]);
    System.out.println(nombres2[1]);
    System.out.println(nombres2[2]);
    
    // tambien podemos hacerlo de la siguiente manera
    String nombres3[] = {"Alejandro 3", "Ivy 3", "Mama 3"};  // podemos colocar los valores directamente en la declaracion
    // String nombres[];
    // nombres = new String [3];
    //nombres2[0]= "Alejandro 2";   // escribirlo de esa manera nos ahorra todas estas lineas de codigo
    // nombres2[1]= "Ivy 2";
    // nombres2[2]= "Mama 2";
    System.out.println(nombres3[0]);
    System.out.println(nombres3[1]);
    System.out.println(nombres3[2]);
    
    
    // recorrer un arreglo mediante el uso de un ciclo for
    int calificaciones[] = {9,8,7,10,10,9,8,8,10,9};  // nuestro arreglo simula las calificaciones de un alumno, a continuacion obtendremos el promedio
    int suma=0;
    System.out.println(calificaciones.length);  // usamos el atributo .length para conocer el tamaño de nuestro arreglo
    // sabemos que para obtener el promedio debemos dividir la suma de las calificaciones entre el total de materias
    // la longitud de nuestro array es de 10 lo que nos indica que
    // indice= 0,1,2....9
    for (int indice= 0; indice<calificaciones.length; indice++){  // creamos la variable indice que sera la encargada de recorrer las posiciones de cada indice [] 
        int valor = calificaciones[indice];  // la variable valor tomara el valor que cada indice almacena, es decir, de cada calificacion
        System.out.println(valor);   // primero verificamos que el recorrido se hace de forma correcta e imprimimos los valores
        suma += calificaciones [indice];  // ahora indice tomara el valor de cada calificacion para sumar conforme recorre el arreglo
    }
    float promedio = (float)suma/(float)calificaciones.length;  // realizamos un casting para poder obtener un resultado decimal correcto
    System.out.println("El promedio final del alumno es " + promedio);
    
    // ciclo foreach
    // el ciclo foreach nos permite recorrer arreglos y obtener los valores de cada indice
    // su estructura es for (variable singular del mismo tipo que el arreglo : arreglo a recorrer)
    // el ejercicio de arriba usando foreach quedaria de la siguiente manera
    int calificaciones2[] = {9,8,7,10,10,9,8,8,10,9};
    int suma2= 0;
    for (int calificacion:calificaciones2){  // en cada iteracion la variable calificacion tomara el valor de cada indice
        System.out.println(calificacion + " foreach");
        suma2 += calificacion;
    }
    float promedio2 = (float)suma2/(float)calificaciones2.length;
    System.out.println(promedio2 + " asi obtenemos el promedio final usando foreach");
    // cabe destacar que foreach solo nos servira para leer valores de arreglos, si queremos modificarlos o asignarlos tendremos que usar
    // el ciclo for tradicional
    
    // utilizamos el ciclo for para asignar valores a un arreglo
    int valores[] = new int [10];
    valores [0] = 0;
    valores [1] = 1;
    valores [2] = 2;     // asi asignariamos valores de la manera tradicional, sin embargo usamos muchas lineas de codigo
    valores [3] = 3;     // nuestro codigo seria insostenible para arreglos mas grandes
    valores [4] = 4;
    valores [5] = 5;
    valores [6] = 6;
    valores [7] = 7;
    valores [8] = 8;
    valores [9] = 9;
                                    // y de esta manera imprimiriamos los valores de cada uno de nuestros indices
    System.out.println(valores[0]);
    System.out.println(valores[1]);
    System.out.println(valores[2]);
    System.out.println(valores[3]);
    System.out.println(valores[4]);
    System.out.println(valores[5]);
    System.out.println(valores[6]);
    System.out.println(valores[7]);
    System.out.println(valores[8]);
    System.out.println(valores[9]);
    
    // para asignar valores usando el ciclo for lo haremos de la siguiente manera 
    int valores2[] = new int [10];
    for (int indice= 0; indice<valores2.length; indice++){
        valores2[indice] = indice;             // de esta manera optimizamos la insercion de valores en nuestro arreglo
        System.out.println(valores2[indice] + "  lectura de valores mediante ciclo for"); // y la impresion/ lectura de valores del mismo
    }
    
    // para imprimir valores tambien podemos hacer uso del ciclo foreach
    for (int valor:valores2){
        System.out.println(valor + " impresion/lectura de valor mediante foreach");
    }
    
    
    // arreglos bidimensionales
    // matrices
    int matriz [][] = new int [4][3] ; // cada par de corchetes define las dimensiones
    matriz [0][0] = 1;  // introducimos entre los corchetes las coordenadas donde hemos de introducir el valor
    matriz [0][1] = 2;  // utilizaremos las coordenadas X y Y
    matriz [0][2] = 3;
    
    matriz [1][0] = 4;
    matriz [1][1] = 5;
    matriz [1][2] = 6;
    
    matriz [2][0] = 7;  // el no. en el primer par de corchetes determina las filas y el sig las columnas
    matriz [2][1] = 8;  // por lo que tenemos una matriz de 4 filas y 3 columnas
    matriz [2][2] = 9;
    
    matriz [3][0] = 10;
    matriz [3][1] = 11;
    matriz [3][2] = 12;
    
    System.out.println(matriz[2][1]);   // para acceder a los valores haremos uso de las coordenadas
    
    // lectura de valores en una matriz mediante ciclo for tradicional
    for (int posx= 0;posx <matriz.length; posx++){
        for (int posy=0; posy<matriz[posx].length; posy++){
                System.out.println(matriz[posx][posy]);
            }
    }
    
    // insercion de valores mediante ciclo for tradicional
    for (int posx= 0;posx <matriz.length; posx++){
        for (int posy=0; posy<matriz[posx].length; posy++){
                matriz[posx][posy]= posy+1;
            }
    }
    
    // recorrido e impresion de valores de una matriz mediante ciclo foreach
    for (int [] fila: matriz){
        for(int celda: fila){
            System.out.println(celda);
        }
    }
    
    // Arreglos multidimensionales o dinamicos
    // a veces necesitaremos crear arreglos sin determminar la longitud
    // ejemplo donde alumnos cursan distinta cantidad de materias
    int calificaciones3[][]= new int [5][];
    calificaciones3[0]= new int [1];
    calificaciones3[1]= new int [2];
    calificaciones3[2]= new int [3];
    calificaciones3[3]= new int [4];
    calificaciones3[4]= new int [5];
    
    calificaciones3[0][0]= 8;
    
    calificaciones3[1][0]= 9;
    calificaciones3[1][1]= 10;
    
    calificaciones3[2][0]= 8;
    calificaciones3[2][1]= 7;
    calificaciones3[2][2]= 9;
    
    calificaciones3[3][0]= 7;
    calificaciones3[3][1]= 5;
    calificaciones3[3][2]= 6;
    calificaciones3[3][3]= 9;
    
    calificaciones3[4][0]= 5;
    calificaciones3[4][1]= 6;
    calificaciones3[4][2]= 6;
    calificaciones3[4][3]= 6;
    calificaciones3[4][4]= 6;
    
    for (int calificacionesPorAlumno[]:calificaciones3){
        for (int calificacion : calificacionesPorAlumno){
            System.out.print(calificacion + " ");
        }
        System.out.println("");
    }
    
    // ejercicios sobre arreglos
    /*int numeros[] = new int [100];
    for (int numero= 0; numero<numeros.length; numero++){
        numeros[numero] = (int)(Math.random() * 100);   
        int suma3 += numeros[numero];
        }
    
    float promedio3 = (float)suma2/(float)calificaciones2.length;
    
    */
    
    
    
    }
    
}
