# Evolución arquitecturas microservicios



martinfowler.com

Los microservicios nos dan la escalabilidad. 

Separar las cosas en microservicios te permite desacoplar. 

Modulariza, principio de única responsabilidad. Esa responsabilidad solo aplica ahí. 

* El stack de netflix revivió Java con SpringBoot. 

# Patrones de diseño - Arquitecturas de microservicios

* gRPC: Mirar

Características:

* Componentes como Servicios
* Organización de negocio como centro
* Productos NO Proyectos
* Smart endpoints <-> dumb pipes
* Gobierno descentralizado
* Administración de dato descentralizado
* Automatización infraestructura
* Diseñado para fallar
* Diseño extensible


[*Leer manifiesto reactivo*](https://www.reactivemanifesto.org/es)

*Mirar packbrocker*

## Qué es una arquitectura microservicios

### Servidor de configuración:
 
- Delegas configuración a un servicio central. 
- En spring hay una cosa que se llama *spring cloud config.*
- Otras opciones:
  - ETCD (existe git2Etcd)
  - Consul (existe git2Consul)
  - Zookeeper: el demonio!

  - [Vault](https://www.vaultproject.io/): Sistema super seguro de secretos! 

### Discovery Service

* Server Side discovery pattern
    * Registro de servicios central.
    * Así funciona Mesos (así funcionan también en Stratio).
    * El router tiene que tener alta disponibilidad y alta tolerancia de fallo. 
* Client Side discovery pattern
    * El cliente hace la peticion al registro central directamente y no hay balanceador directamente. 
    * El registro central es el que hace el balanceador. 

Salió [Eureka](https://github.com/Netflix/eureka/wiki): es el servicio de descubrimiento de Netflix. Netflix empezó a correr en Amazon cuando AWS no te hacía nada de routeado, balanceador, etc...

### Arquitectura de Referencia

* API Gateway: Sitio donde publicamos todos nuestros contratos. Incluso podemos componer contratos. 

* [WSO2](https://wso2.com/api-management/): Sri Lanka API Gateway

### Monitorizacion

* Spring Boot Actuator

* Lagoom.
* Micronaut.

* Prometheus es el mejor ahora mismo. Luego te lo enseña en un Grafana. 

**ThoughtWorks** https://www.thoughtworks.com/  https://www.thoughtworks.com/radar


https://www.thoughtworks.com/radar/languages-and-frameworks/scala-the-good-parts


### Log Centralizado

Stack ELK -> Elastic Logstash Kibana

* Administración de log:
    * Logstash:
    * syslog-ng:
* Motor búsqueda:
    * ElasticSearch: Te indexa
    * Apache Solr
* Herramienta visualización:
    * Kibana
    * Grafana

Problemas de trazabilidad:

Todos los problemas los soluciones
* Spring Cloud Sleuth
* Open Tracing para otros lenguajes. 

Otros proyectos:

* Zipkin
* Jaeger


**Mirar Histryx para Circuit Breaker.**