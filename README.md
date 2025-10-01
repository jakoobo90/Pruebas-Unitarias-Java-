Calculator
Contiene métodos para operaciones básicas:
- `add(int a, int b)` → suma.  
- `subtract(int a, int b)` → resta.  
- `multiply(int a, int b)` → multiplicación.  
- `divide(int a, int b)` → división (lanza excepción si `b == 0`).  

👉 Se usa para mostrar cómo validar casos normales y casos de error (ejemplo: división entre cero).

### 🔹 Palindrome
Verifica si un texto es un **palíndromo** (se lee igual de izquierda a derecha y de derecha a izquierda).  
Características:
- Ignora mayúsculas/minúsculas.  
- Ignora espacios y signos de puntuación.  
- Quita acentos y caracteres especiales.  

Ejemplos:
- `"Oso"` → ✅ true  
- `"Anita lava la tina"` → ✅ true  
- `"Hola"` → ❌ false  

---

## 🧪 Pruebas unitarias

### CalculatorTest
Valida los siguientes casos:
- Suma de enteros positivos y cero.  
- Resta con resultados positivos y negativos.  
- Multiplicación normal y con cero.  
- División normal.  
- División entre cero debe lanzar `ArithmeticException`.  

### PalindromeTest
Valida:
- Palíndromos simples (`Oso`).  
- Palíndromos con frases largas y espacios (`Anita lava la tina`).  
- Casos que no son palíndromos (`Hola`).  
- Manejo de acentos y caracteres especiales.  

---

## ▶️ Cómo ejecutar las pruebas


---

## ▶️ Cómo ejecutar las pruebas

### 🔹 En Spring Tools Suite (STS / Eclipse)
1. Importar el proyecto como **Maven Project**.  
2. Abrir el archivo de prueba (por ejemplo `CalculatorTest.java`).  
3. Clic derecho sobre el archivo o método → **Run As → JUnit Test**.  
4. En la vista **JUnit** verás los resultados (verde = aprobado, rojo = falló).  

👉 También puedes correr todas las pruebas del proyecto:  
- Clic derecho en el proyecto → **Run As → Maven test**.  

---

### 🔹 En Visual Studio Code
1. Instalar la extensión **Extension Pack for Java** (incluye soporte de pruebas con JUnit).  
2. Abrir el archivo `CalculatorTest.java` o `PalindromeTest.java`.  
3. Encima de cada método `@Test` verás un botón ▶️ **Run Test**.  
   - Haz clic para ejecutar esa prueba en particular.  
   - También puedes abrir el panel **Testing** (icono de beaker 🧪 en la barra lateral) y seleccionar **Run All Tests**.  

👉 Desde la terminal integrada en VS Code:
```bash
Ejecutar todas las pruebas
mvn test

Ejecutar una clase de prueba específica
mvn -Dtest=CalculatorTest test
mvn -Dtest=PalindromeTest test
