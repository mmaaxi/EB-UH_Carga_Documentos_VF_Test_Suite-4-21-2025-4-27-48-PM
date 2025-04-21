Feature: Validar bloqueo de cuenta tras múltiples intentos fallidos

  Scenario: Bloqueo de cuenta después de intentos fallidos
    Given la página de inicio de sesión está abierta
    When el usuario intenta iniciar sesión con credenciales incorrectas tres veces consecutivas
    Then el sistema contabiliza los intentos fallidos
    And el usuario verifica el mensaje de bloqueo de cuenta
    Then se muestra el mensaje 'Cuenta bloqueada temporalmente por seguridad'
    When el usuario espera el tiempo definido para desbloqueo e intenta nuevamente
    Then el sistema permite el inicio de sesión tras el desbloqueo