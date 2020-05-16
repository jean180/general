"""
Escribir un programa que almacene la cadena de caracteres contraseña en una variable,
pregunte el usuario por la contraseña e imprima por pantalla si la contraseña introducida
por el usuario coincide con la guardada en la varibale sin tener en cuenta mayúsculas y minúsculas.
"""

password = "contraseña"

password_del_usuario = input("Introduce la contraseña: ")
password_del_usuario = password_del_usuario.lower()

if password == password_del_usuario:
    print("El password es correcto")
else:
    print("El password no coincide")