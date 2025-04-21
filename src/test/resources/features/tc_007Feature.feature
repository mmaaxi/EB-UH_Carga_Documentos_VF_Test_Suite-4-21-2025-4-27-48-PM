Feature: Validar error en carga de documento con formato no permitido

  Scenario: Intentar cargar documento con formato no soportado
    Given el usuario está en la página de carga de documentos
    When selecciona un documento con formato .exe
    And intenta cargar el documento
    Then el sistema rechaza el archivo
    And se muestra un mensaje indicando 'Formato de archivo no permitido'