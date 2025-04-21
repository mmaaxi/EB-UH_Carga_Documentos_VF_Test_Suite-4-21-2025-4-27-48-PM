Feature: Validar inicio de sesión con credenciales correctas

  Scenario: Usuario inicia sesión exitosamente
    Given El usuario está en la página de inicio de sesión
    When El usuario ingresa un nombre de usuario válido
    And El usuario ingresa una contraseña válida
    And El usuario hace clic en el botón 'Iniciar sesión'
    Then El usuario es redirigido a la página principal del sistema