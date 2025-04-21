Feature: Validar descarga de documento

  Scenario: Descargar un documento cargado en el sistema
    Given El usuario ha seleccionado un documento previamente cargado
    When El usuario hace clic en "Descargar documento"
    Then El documento se descarga correctamente al dispositivo del usuario