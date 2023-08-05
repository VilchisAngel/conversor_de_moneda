# Conversor de Moneda
🏁 Challenge One Java.


🚩 Desarrollar un conversor de divisas utilizando el lenguaje Java.

El proyecto son con fines de práctica y demostración del conocimiento adquirido en el proceso de aprendizaje del programa Oracle Next Education, de la formación "Java Orientado a Objetos" de Alura Latam, una guia de aprendizaje para el conocimiento basico para el desarrollo orientado a objetos con buenas practicas.

📗 Sobre el proyecto conversor de moneda: Se nos solicitó desarrollar un conversor de moneda utilizando el lenguaje Java, la caracteristica escencial es convertir una moneda de un pais o de nuestro pais a Dolares, Euros etc.. o inversamente, como punto extra se nos dejo implementar nuestra propia creatividad para el desarrollo del programa.

📑 Implementación del programa : para el desarrollo del proyecto me base de acuerdo con el aprendizaje adquiridos durante los cursos de la formacion "Java orientado a objetos" y basado en eso el proyecto esta dividido por clases la cual cada uno implementa una logia diferente que a su ves se relacionan para construir el programa, el programa implementa una interfas grafica basica y sencilla con la cual el usuario tendra la interación y procesar lo que se solicite, la complejidad del desarrollo del programa fue implementar una API de divisas en tiempo real para a si tener una idea del valor real del cambio de moneda en su momento, algunas otras caracteristas del proyecto son :

  📌  Biblioteca Swing: con los componentes de java Swing fue con lo que se desarrollo la parte de la interfaz grafica. 
  
  📌  JOptionPane : es una clase de java Swing: para mostrar algunos cuadros de dialogos en algunas partes del programa.
  
  📌  API ExchangeRate-API: la api que consume el programa para obtener las divisas en tiempo real.

  📌  Paquete Gson: para parsear la respuesta de la api en formato Gson para acceder y manipular la propiedades de la api.

  📌  Recursos extras: algunos recursos extras fue cargar algunas imagenes para la interfaz grafica para tener una mejor vista.


  🚨 Restricciones del Programa: el programa es capaz de leer los datos ingresados por el usuario y procesar y devolver una respuesta positiva o negativa es decir si el usuario a ingresado algun texto el programa le lanzara una advertencia que no se admite este tipo de dato en caso contrario devolvera una respuesta adecuada.

  ✅ Detalles a tomar en consideracion: el programa funciona correctamente al ejecutarlo, pero durante su uso podria presentar fallas o errores algunos de ellos podrian ser:  aque el usuario halla ingresado un dato no valido, que se haya hecho una operacion que exceda la capicidad de las variables, la conexion de la api halla dejado de funcionar, las peticiones de la api halla excedido su cuota de solicitud de API disponible, estos son algunos de los problemas que se puedan surgir al utilizar el programa y se manifestaran atraves de una ventana de dialogo.

  📕 Dato extra sobre la API : la api presenta actualizaciones de las divisas en tiempo real pero en cada cierto retraso, ya que tienden a ser actualizadas cada hora del dia esto se debe a su version gratuita de la api, es por ello que no siempre sera preciso el cambio de una moneda de un pais a otro.
