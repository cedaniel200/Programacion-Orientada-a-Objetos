Imaginemos estamos viendo el espectáculo de Gepetto y Pinocho y decidimos recrearlo en una pequeña aplicación.

Para empezar con nuestra aplicación debemos hacernos un par de preguntas.
¿Quien conoce como manipular un títere?, ¿Quien realiza la acción?. Es claro que quien sabe como manipular un títere es Gepetto y quien realiza la acción es Pinocho, solo con estas dos simples preguntas ya podemos hacernos una idea quien tiene las funciones de alto nivel y quien las de bajo nivel.

Gepetto contiene las funciones de alto nivel (Es quien conoce las reglas del negocio y sabe como manipular un titere), cuales serian estas funciones.

    • void mostrarTitereInmovil();
    • void moverCabezaDelTitere();
    • void moverBrazoIzquierdoDelTitere();
    • void moverBrazoDerechoDelTitere();
    • void moverPiernaIzquierdoDelTitere();
    • void moverPiernaDerechoDelTitere();

Pinocho contiene las funciones de bajo nivel (Es quien simplemente realiza las acciones que Gepetto sabiamente le ordena), cuales serian estas funciones.

    • void inmovil();
    • void moverCabeza();
    • void moverBrazoIzquierdo();
    • void moverBrazoDerecho();
    • void moverPiernaIzquierdo();
    • void moverPiernaDerecho();


Para ilustrar esto tendremos dos componentes uno de alto nivel (donde estará Gepetto) y otra de bajo nivel (Donde estará Pinocho). A estas alturas es obvio que Gepetto debe tener una instancia de Pinocho para poder manipularlo.

Es evidente a simple vista que el componente de alto nivel depende del componente de bajo nivel lo cual es un error, imaginemos que Pinocho sale a vacaciones y viene en su reemplazo Pepito Grillo, ¿Qué pasaría?, ¿Tendríamos que hacer cambios en nuestra aplicación?, es obvio que la respuesta es si, primero Gepetto no debería estar condicionado a trabajar con un solo títere, él es un titiritero y sabe manipular a cualquier títere que le pongan, por lo cual empiezo a evidenciar un problema de abstracción, una ultima consideración seria, y que tal que él que salga a vacaciones es Gepetto, podríamos crear un nuevo titiritero para Pinocho, es evidente que con el diseño actual no podríamos, por lo que vamos a hacer una mejor abstracción y mejorar considerablemente nuestro diseño e invirtiendo la dependencia.

Creo que ya nos dimos cuenta que los conceptos principales del dominio de la aplicación son Titiritero y Títere por lo que creo que deberíamos abstraer su comportamiento creando dos Interfaces y que estas contengan la declaración de las funciones ya mencionadas.

Como segundo paso Gepetto debería implementar la interfaz Titiritero porque es claro que él es un titiritero.

El tercer paso consiste en que Pinocho implemente la interfaz Titere.

Ahora Gepetto no debe tener una instancia de Pinocho sino declara una variable de clase de tipo Titere y es necesario entonces que los titiriteros tengan una función adicional setTitere(Titere titere) tengamos presente que en un espectáculo de títeres un titiritero puede cambiar contante mente de títere y creo que esta función le caería de mil maravillas.

Por ultimo viene la pregunta crucial donde deben ir estas interfaces porque de dicha ubicación dependen si se logra la inversión de dependencia o no.  Imagino que ya tienes la respuesta, si así es, deben ir en el componente de alto nivel.
Nuestra aplicación ahora puede crecer de una forma más flexible, puedes crear más títeres y mas titiriteros si así lo deseas.