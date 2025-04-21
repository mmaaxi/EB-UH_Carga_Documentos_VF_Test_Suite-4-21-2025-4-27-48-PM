Feature: Validar carga de documento con formato adecuado

  Scenario: Cargar un documento PDF válido
    Given el usuario tiene un documento PDF válido
    When selecciona el documento
    Then el sistema debe reconocer el formato y mostrar una vista previa
    When el usuario hace clic en "Cargar documento"
    Then el sistema debe procesar la carga y mostrar un mensaje de éxito