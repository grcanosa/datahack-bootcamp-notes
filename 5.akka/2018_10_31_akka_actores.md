# Introducción a Akka

Akka está fundamentado en futuros y promesas.

## Actores

* Unidad fundamental de computación del sistema que engloba un restado, comportamiento y un buzón de mensajes. 

* Un actor tiene un estado propio.
* Tiene un hilo de control propio. 
* Comportamiento:
  * Contenido en las funciones de reacción a mensajes. 
* Todo actor tiene asociado un buzón. 
* Por defecto Akka tiene FIFO.
* Los mensajes se procesan uno a uno.

Referencia
* Los actores se encapsulan detrás de una referencia. 
    * Este objeto si se puede utilizar en distintas clases. 

* Extienden de `trait Actor` y solo te piden que implementes el método `Receive`
* Receive es una partial funcion.

* Primero intenta ejecutar receive y si no está definido utiliza el método unhandled.

## Mensajes

* Es un objeto de cualquier tipo.
* Lo más típico es hacer un companion object con el protocolo.
* Los mensajes suelen ser case classes para poder hacer el pattern matching directamente. 


# Actor System

* Se encarga de generar los hilos para los actores. Básicamente es un pool de hilos.
* Tiene forma de árbol. UN padre y muchos hijos.
* Se recomienda tener un solo ActorSystem por aplicación. 


## Pasos de Mensajes

* ask -> Future[Any] -> Cuando ha llegado el mensaje te devuelve.
* tell -> Devuelve Unit. (fire and forget!). Esto es lo ideal, no conviene hacer ask. 
* Tenemos en el receive la variable de entorno `sender`.

## TYPESAFE

HOCON tipo de configuracion

https://www.stubbornjava.com/posts/typesafe-config-features-and-example-usage