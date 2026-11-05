// Pseudocódigo del ordenamiento por intercambio (Bubble Sort)
// Autora: Noemi Mata Ruiz

Algoritmo Intercambio
	Definir fila, i, j, aux, comparaciones, intercambios Como Entero
	Definir huboCambio Como Logico
	Dimension fila[5]
	
	// Primero pido el número de cada compañero, así como nos formamos en la fila
	Para i <- 1 Hasta 5 Hacer
		Escribir "Numero del compañero ", i, ":"
		Leer fila[i]
	FinPara
	
	// Pongo los contadores en cero para ir contando lo que hacemos
	comparaciones <- 0
	intercambios <- 0
	huboCambio <- Verdadero
	i <- 1
	
	// Aquí empiezan las pasadas, las repito mientras alguien se siga cambiando de lugar
	Mientras i < 5 Y huboCambio Hacer
		huboCambio <- Falso
		
		// En cada pasada voy comparando a cada compañero con el que tiene a su derecha
		// Uso 5 - i porque los últimos ya están en su lugar y ya no los tomo en cuenta
		Para j <- 1 Hasta 5 - i Hacer
			comparaciones <- comparaciones + 1
			
			// Si el de la izquierda es mayor, se cambian de lugar
			Si fila[j] > fila[j + 1] Entonces
				// Uso aux para guardar un número y no perderlo al hacer el cambio
				aux <- fila[j]
				fila[j] <- fila[j + 1]
				fila[j + 1] <- aux
				intercambios <- intercambios + 1
				// Marco que sí hubo un cambio en esta pasada
				huboCambio <- Verdadero
			FinSi
		FinPara
		
		// Al terminar la pasada muestro cómo quedó la fila
		Escribir Sin Saltar "Pasada ", i, ": "
		Para j <- 1 Hasta 5 Hacer
			Escribir Sin Saltar fila[j], " "
		FinPara
		Escribir ""
		
		i <- i + 1
	FinMientras
	
	// Cuando ya nadie se cambió de lugar, la fila quedó ordenada y muestro los resultados
	Escribir "Pasadas: ", i - 1
	Escribir "Comparaciones: ", comparaciones
	Escribir "Intercambios: ", intercambios
FinAlgoritmo