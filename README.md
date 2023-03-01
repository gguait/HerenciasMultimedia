# Polimorfismo

  Escribe una aplicación donde:

    a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10. ListaMultimedia del Ejercicio 10.
    b) Se creen tres discos y se añadan a la lista.
    c) Se creen tres películas y se añadan a la lista.
    d) Trabajando con la lista y suponiendo que no se sabe en qué posiciones están los discos y las películas:
  
    1. Se muestre la lista por pantalla.
    2. Se calcule la duración total de los objetos de la ListaMultimedia.
    3. Se muestre cuántos discos hay de rock.
    4. Se obtenga cuántas películas no tienen actriz principal.
    
  Se va a implementar un simulador de Vehículos. Existen dos tipos de Vehículo: Coche y Camión.

    a) Sus características comunes son la matrícula y la velocidad. En el
    momento de crearlos, la matrícula se recibe por parámetro y la velocidad se
    inicializa a 0. El método toString() de los vehículos devuelve información acerca
    de la matrícula y la velocidad. Además se pueden acelerar, pasando por
    parámetro la cantidad en km/h que se tiene que acelerar.

    b) Los coches tienen además un atributo para el número de puertas, que
    se recibe también por parámetro en el momento de crearlo. Tiene además un
    método que devuelve el número de puertas.
  
    c) Los camiones tienen un atributo de tipo Remolque que inicializa a null
    (para indicar que no tiene remolque). Además tiene un método ponRemolque(),
    que recibe el Remolque por parámetro, y otro quitaRemolque(). Cuando se
    muestre la información de un camión que lleve remolque, además de la
    matrícula y velocidad del camión, debe aparecer la información del remolque.
  
    d) En esta clase hay que sobrescribir el método acelerar de manera que
    si el camión tiene remolque y la velocidad más la aceleración superan los 100
    km/h se lance una excepción de tipo DemasiadoRapidoException.
  
    e) Hay que implementar la clase Remolque. Esta clase tiene un atributo
    de tipo entero que es el peso y cuyo valor se le da en el momento de crear el
    objeto. Debe tener un método toString() que devuelva la información del
    remolque.
 
    f) Implementar la clase DemasiadoRapidoException.
    Implementar este diseño con la estructura más convincente.

  Utilizando las clases del ejercicio anterior, implementa una aplicación que haga lo siguiente:

    a) Declare y cree un array de 4 vehículos.

    b) Cree 2 camiones y 2 coches y los añada al array.

    c) Suponiendo que no se sabe en qué celdas los coches y en cuáles los camiones:
    1. Ponga un remolque de 5000 Kg a los camiones del array.
    2. Acelere todos los vehículos.
    3. Escriba por pantalla la información de todos los vehículos.
