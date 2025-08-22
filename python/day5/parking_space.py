parking_space = []
def occupy_space(car):
    parking_space.append(car)
    print("space occupied")
    for index in range(1, 20):
     index+1
     print(parking_space.index(car))
     return f"{car} added at above index position ."

#result=occupy_space("ToyotaReg-123Abuja")
print(occupy_space("ToyotaReg-123Abuja"))


def display_vacant_space():
    if not parking_space:
        return "parking space is empty."
    else:
        return [f"{idx}. {item}" for idx, item in enumerate(parking_space, start=1)]



def remove_car(car):
    if car in parking_space:
        parking_space.remove(car)
        return f"{car} has left its slot.index vacant."
    else:
        return f"{car} not found in list."







