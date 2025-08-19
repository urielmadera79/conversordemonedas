# 💱 Conversor de Monedas en Java

Este proyecto es una aplicación de consola desarrollada en **Java**, que permite convertir entre diferentes divisas en tiempo real utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com/).  

---

## 🚀 Características principales
- Conversión rápida entre monedas predefinidas (USD, ARS, BRL, COP).
- Conversión personalizada introduciendo cualquier código de moneda ISO 4217 (ej: USD, EUR, MXN).
- Consumo de API en tiempo real para obtener las tasas de conversión actualizadas.
- Interfaz en consola sencilla y práctica.
- Manejo básico de errores en la entrada de datos.

---

## 📂 Estructura del proyecto

---
conversorDeMonedas/
│── src/
│ ├── Principal.java # Clase principal (menú e interacción con el usuario)
│ ├── ConversorDeMonedas.java # Lógica de consumo de API y conversión
│ ├── Moneda.java # Representación de una moneda con su código y tasa
│ ├── MonedasXAPI.java # Mapeo del JSON de la API
│── README.md # Documentación del proyecto


## ⚙️ Requisitos

- **Java 11 o superior**  
- **Conexión a Internet** (para consultar la API de conversión)  
- Dependencia de **Gson** para parsear el JSON de la API.

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/TU_USUARIO/conversorDeMonedas.git
2. Compila los archivos Java:
   javac -cp gson-2.10.1.jar src/*.java
3. Ejecuta el programa:
   java -cp gson-2.10.1.jar;src Principal


📸 Capturas de uso
Menú principal
********************************************************
Bienvenidos al Sistema de Conversiones de Monedas
1) Dólar =>> Peso Argentino
2) Peso Argentino =>> Dólar
3) Dólar =>> Real Brasileño
4) Real Brasileño =>> Dólar
5) Dólar =>> Peso Colombiano
6) Peso Colombiano =>> Dólar
7) Convertir otras divisas...
8) Salir
********************************************************
Introduzca la opción deseada:

Ejemplo de conversión

Convirtiendo: USD --> ARS
Cantidad a convertir: 100
100.0 USD equivalen a: 34900.5 ARS

📚 Tecnologías utilizadas

   * Java 17

   * HttpClient (Java estándar) para consumir la API.

   * Gson para parsear la respuesta JSON.

👨‍💻 Autor

Uriel Madera
📧 Contacto: urielmadera@gmail.com
📌 Proyecto Desafío de Programación en Java.

🤝 Contribuciones

Las contribuciones son bienvenidas.
Si encuentras un error o tienes una mejora, abre un issue o envía un pull request.

📝 Licencia

Este proyecto está bajo la licencia MIT.
Consulta el archivo LICENSE

