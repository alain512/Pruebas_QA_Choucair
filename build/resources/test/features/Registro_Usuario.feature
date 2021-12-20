#autor Creado por Alain Quintero Guerra

  Feature: Cómo usuario requiero realizar el registro en la página de My Store
    Scenario Outline: Restristrar usuario en My Store
      Given que el usuario se encuentra ubicado en la pagina my store
      When cuando el usuario seleccione el boton signin
      And el usuario ingrese los datos de registro
        | correo   |
        | <correo> |
      Then el usuario vera el siguiente mensaje Welcome to your account. Here you can manage all of your personal information and orders.
Examples:
  | correo                       |
  | alain.quintero10@outlook.com |
  | alain.quintero10@outlook.com |