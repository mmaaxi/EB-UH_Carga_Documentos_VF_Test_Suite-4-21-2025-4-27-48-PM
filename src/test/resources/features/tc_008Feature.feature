Feature: Validar límite de tamaño en la carga de documentos

  Scenario: Cargar un documento que excede el tamaño máximo permitido
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona un documento que excede el tamaño máximo permitido
    Then El sistema identifica que el archivo es demasiado grande
    When El usuario intenta cargar el documento
    Then Se muestra un mensaje de error indicando 'El archivo excede el tamaño permitido'