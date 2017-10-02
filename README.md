# Práctica de Software Colaborativo
## Asignatura: *Ingeniería Web: Arquitectura y Patrones para Aplicaciones Web*
### Alumno: *Alberto Jimenez de los Galanes Miralles*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### Descripción
Práctica 2. Implementacion de la entidad personal aplicando patrones de diseño.

[![Build Status](https://travis-ci.org/AlbertoNitro/APAW.ECP1.Alberto.svg?branch=develop)](https://travis-ci.org/AlbertoNitro/APAW.ECP1.Alberto)
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=es.upm.miw:IWVG.SwC.Alberto)](https://sonarcloud.io/dashboard/index/es.upm.miw:APAW.ECP1.Alberto)


## Desarrollador
Alberto Jimenez de los Galanes Miralles (@AlbertoNitro)


## Explicación del ejemplo de aplicación e implementación del patrón "Strategy" 

### Strategy (Patrón de comportamiento)

**[Problema]:**
Nos encontramos un escenario en el que para conseguir un objetivo, tenemos diferentes formas, y donde estas formas pueden cambiar o añadirse nuevas en un futuro. Normalmente tenemos sentencias condicionales para seleccionar el comportamiento deseado.

**[Ejemplos de situaciones]:**
    1. Un programa utilizado varios algoritmos para encriptar un fichero.
    2. Un editor de texto nos ofrece la posibilidad de poner un texto en negrita, cursiva, subrayado entre otras. (Ejemplo implementado)

**[Solución]:** 
Permite mantener un conjunto de algoritmos de entre los cuales el objeto cliente puede elegir aquel que le conviene e intercambiarlo dinámicamente según sus necesidades. La solución pasa por encapsular los distintos algoritmos en una jerarquía y que el cliente trabaje con un objeto intermediario. El cliente puede elegir el algoritmo que prefiera de entre los disponibles, o el mismo contexto puede ser el que elija el más apropiado para cada situación.
    
**[Descripcion genérica del UML del patrón]:**
![UML](https://upload.wikimedia.org/wikipedia/commons/3/32/Strategy_Pattern.jpg)

Contamos con 3 roles:
* **Contexto**. Es el elemento cliente que usa los algoritmos, por tanto, delega en la jerarquía de estrategias. Configura una estrategia concreta mediante una referencia a la estrategia necesaria.
* **EstrategiaGenerica**. Declara una interfaz común o clase abstracta para todos los algoritmos soportados. Esta interfaz será usada por el contexto para invocar a la estrategia concreta.
* **EstrategiaConcreta**. Implementa el algoritmo pertinente utilizando la interfaz definida por la EstrategiaGenerica.
    
Contexto emplea la interfaz comun "EstrategiaGenerica". EstrategiaGenerica es la clase padre de las EstrategiaConcretas. Donde EstrategiaConcreta hereda de esta interfaz comun implementado los algoritmos pertienentes.


**[Explicación del ejemplo implementado]**
Se pretende que un editor de texto pueda realizar diferentes marcados sobre una cadena de texto: negrita, subrayado e italic. Las 3 opciones de marcado realizan una accion parecida, el marcado de una cadena de texto, pero cada una lo hace de manera diferente aportando una nueva funcionalidad. Podríamos sacar una interface común que defina su comportamiento y aplicar el patron Strategy de la siguiente forma:

* **Marker** -> (Contexto)
* **MarkerStrategy** -> (EstrategiaGenerica)
* **BoldMarkerStrategy**  -> (EstrategiaConcreta)
* **ItalicMarkerStrategy** -> (EstrategiaConcreta)
* **UnderlineMarkerStrategy** -> (EstrategiaConcreta)

Nuestra clase "Marker" se basara (delegara) en la interfaz comun "MarkerStrategy", donde esta cuenta con clases hijas que realizan un determinado marcado (delega nuevamente). Ademas si mas tarde, necesitáramos añadir un nuevo formato de marcado a nuestro programa, solo tendríamos que desarrollar una neuva clase que implementara "MarkerStrategy". Y así evitaríamos tener que modificar el código que ya tenemos escrito. Manteniendo uno de los principios SOLID, el de Open-Closed. El cual señala que nuestro código debería estar abierto a la extensión, pero cerrado a la modificación. Es decir, que para añadir una nueva funcionalidad, no tengamos la necesidad de modificar los algoritmos o metodos que ya están desarrollados. Por lo que aquí es donde el patrón strategy cobra su importancia.



    