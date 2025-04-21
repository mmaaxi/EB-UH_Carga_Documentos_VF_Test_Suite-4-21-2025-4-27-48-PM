Feature: Validar cierre de sesión

  Scenario: Cerrar sesión y validar acceso a páginas internas sin autenticación
    Given El usuario ha iniciado sesión con credenciales válidas
    When El usuario hace clic en la opción 'Cerrar sesión'
    Then El sistema cierra la sesión y el usuario es redirigido a la página de inicio
    When El usuario intenta acceder a una página interna sin autenticación
    Then El sistema redirige al usuario a la página de inicio de sesión