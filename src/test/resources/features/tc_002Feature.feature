Feature: Validar mensaje de error con credenciales incorrectas

  Scenario: Validar mensaje de error al iniciar sesión con credenciales incorrectas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa un nombre de usuario incorrecto
    And el usuario ingresa una contraseña incorrecta
    And el usuario hace clic en 'Iniciar sesión'
    Then se muestra el mensaje de error 'Credenciales incorrectas'