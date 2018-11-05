# Frameworks

Gaston Lucero.

## TypeSafe

Librería de configuraciones del proyecto. 
Está en todos los proyectos de Akka, Lagom, Play, Slick.

* Utiliza objetos Java simples.
* El formato es el que queramos.



## Slick

Acceso a base de datos.
Maneja los datos como colecciones de Scala. 

## Frameworks reactivos

* Backpressure. -> Concepto relacionado con tecnologías reactivas. 
  * Antes de que pueda fallar el sistema le va a decir al cliente que no puede manejar más de X transacciones. 
  * El cliente sabe que solo puede manejar ese número. 
  * El cliente sabe que tiene que crear más "hijos" (actores en Akka) para poder gestionar más de esas peticiones. 
  * Otra opción sería poder encolar las peticiones y darselas cuando puedas procesarlas. 


## Play

* Play usa inyección de dependencias.
  * Se usa con `@`.
  * Es para no escribir cosas repetitivas.
  

* Mirar "amonite". Es una consola de Scala. 

* Para documentación y mocks mirar raml y swagger. 

Herramientas de despliege: Mesos, Lightbend tiene uno también (Conduct-R, de pago).


