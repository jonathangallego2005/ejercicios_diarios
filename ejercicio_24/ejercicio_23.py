list = []
for i in range(5):
    elemento = int(input(f"Ingresa el elemento {i+1} de la lista: "))
    list.append(elemento)
current_index = 0
input_usuario = ""
while input_usuario != "salir":
    input_usuario = input("Escribe 'next' para siguiente, 'prev' para anterior, o 'salir' para terminar: ")
    if input_usuario == "next":
        print(f"Elemento actual: {list[current_index]}")
        current_index = (current_index + 1) % len(list)
    elif input_usuario == "prev":
        current_index = (current_index - 1 + len(list)) % len(list)
        print(f"Elemento actual: {list[current_index]}")
