# AutomatizacionRetoPractico
Hola, este es el resultado de la prueba de automatización, los resultados se ven reflejados en la rama master o principal.
Durante el desarrollo del mismo se encontró el siguiente bug:
Descripción del Bug:

Durante la automatización del flujo para agregar y gestionar un candidato, después de completar el formulario de registro y guardar los datos del candidato, la funcionalidad esperada es que se muestre el botón "Schedule Interview". Sin embargo, en lugar de esto, el sistema muestra un botón "Shortlist". A pesar de este comportamiento inesperado, intenté continuar con el flujo seleccionando el botón "Shortlist", lo que me llevó a una nueva pestaña con un botón "Save". Al hacer clic en este botón, el sistema arroja un error inesperado y no carga ninguna página adicional, impidiendo que se continúe el flujo hasta la contratación del candidato.

Pasos para replicar:

Realizar el login en la aplicación.
Navegar hasta la sección para agregar un nuevo candidato.
Llenar todos los campos obligatorios del formulario del candidato.
Hacer clic en el botón "Save".
En lugar de ver el botón "Schedule Interview", aparece "Shortlist".
Hacer clic en "Shortlist" y luego en "Save".
Se genera un error inesperado que impide continuar el flujo.
Comportamiento esperado: Después de guardar los datos del candidato, el sistema debería mostrar el botón "Schedule Interview" y permitir la contratación sin errores.

Impacto:
Este bug interrumpe el flujo crítico de contratación de candidatos, lo que impide realizar pruebas automáticas completas de este escenario. El error es replicable y afecta la validación final del estado del candidato.

Evidencias: https://drive.google.com/drive/folders/122H05230qrXovbk0iIdMSxu_md0kDQC2?usp=drive_link

-De igual manera al no poder continuar con dicho flujo realicé la validación al ultimo estado en el que quedó el candidato que sería Application Initiated.
