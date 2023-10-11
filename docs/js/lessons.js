export const lessons = [
  {
    numLessons: 2,
    issue: 'Java SE',
    day: 14,
    msg: `<small>“Estas listo para aprender las lecciones que la vendran en vida”.<br>
    FRASES PARA SUPERAR EL SÍNDROME DEL IMPOSTOR </small>`,
    myProgress: '🥚>🐣',

    exercise: [
      {
        numExercise: 1,
        title: '',
        description:`<small>Escribe un programa, utilizando para ello el paradigma de POO, que juegue
        con el usuario a adivinar un número. Debe cumplir los siguientes
        requerimientos:
        
        <p>1. El ordenador debe generar un número entre 1 y 500, y el usuario tiene
        que intentar adivinarlo.
        
        <p>2. Cada vez que el usuario introduce un valor, el ordenador debe decirle al
        usuario si el número que tiene que adivinar es mayor o menor que el que
        ha introducido el usuario.
        
        <p>3. Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el
        número de veces que el usuario ha intentado adivinar el número.
        
        <p>4. Si el usuario introduce algo que no es un número, debe indicarlo en
        pantalla, y contarlo como un intento indicando que no ha conseguido
        reconocer la entrada lanzando la excepción InputMismatchException.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-1110-ta10/tree/main/src/com/tmbs/ta10_01',
        urlPG: '',
      },
      {
        numExercise: 2,
        title: '',
        description:  `<small>Escribe un programa , utilizando para ello el paradigma de P00, que lance y capture una excepción customizada.
        <p> Crea para ello una package diferente que puedas reutilizar para el resto de tus proyectos. 
        Recomendaciones:
        <li>El programa abre un bucle by{) en el que comienza mostrando un mensaje por pantalla.
        <li>A continuación, crea un objeto de la clase Exception, indicando en su constructor un mensaje explicativo.
        El resultado debe ser simila`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-1110-ta10/tree/main/src/com/tmbs/ta10_02',
        urlPG: ''
      },
      {
        numExercise: 3,
        title: '',
        description: `<small>Escribe un programa , utilizando para ello el paradigma de POO, que genere un número aleatorio e indique si el número generado es par o impar. <p>El programa utilizará para ello el lanzamiento de una excepción. 
        <p>Recomendaciones: 1. El programa utiliza la clase Random() para obtener un número aleatorio entre O y 999 (por poner un rango cualquiera).
        <p>2. Se determina si el número es par o impar y se lanza una excepción con el correspondiente mensaje para indicarlo (se limitará a mostrar el mensaje asociado a la excepción capturada)`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-1110-ta10/tree/main/src/com/tmbs/ta10_03',
        urlPG: ''
      },
      {
        numExercise: 4,
        title: '',
        description: `<small>Escribe un programa , utilizando para ello el paradigma de POO, que nos permita realizar cálculos simples (suma, resta, multiplicación, potencia, raíz cuadrada, raíz cubica y división). 
        <p>El programa ha des estar preparado para gestionar los posibles errores de calculo.
        <p>Has de utilizar para ello el control de excepciones de JAVA.
        <p>Recomendaciones: 1. Utiliza siempre que sea posible las Excepciones definidas en la API de lava 8. 2.
        <p>Puedes utilizar como interfaz visual Scanner o lOptionPane. 3. Estructura correctamente el código en diferentes packages.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-1110-ta10/tree/main/src/com/tmbs/ta10_04',
        urlPG: ''
      },
      {
        numExercise: 5,
        title: '',
        description: `<small>Haz una clase llamada Password que siga las siguientes condiciones: 
        <li>Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de s. 
        <li>Los constructores serán los siguiente: ✓ Un constructor por defecto. ✓ Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud. Los métodos que implementa serán: 
        <li>esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números. <li>generarPassword(): genera la contraseña del objeto con la longitud que tenga. Método get para contraseña y longitud. Método set para longitud.
        Ahora, crea una clase clase ejecutable:
        <li>•	Crea un array de Passwords con el tamaño que tu le indiques por teclado y crea un bucle que cree un objeto para cada posición del array.
        <li>•	Indica también por teclado la longitud de los Passwords (antes de bucle).
        <li>•	Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
        Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
        contraseñal valor_booleanol contraseña2 valor bololeano2
        `,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-1110-ta10/tree/main/src/com/tmbs/ta10_05',
        urlPG: ''
      },
    ]
  },
]


 
