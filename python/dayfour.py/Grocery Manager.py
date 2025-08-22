grocery_list = []

def add_item():
    item = input("Enter item to add: ")
    grocery_list.append(item)
    print(f{item}' added.")

def remove_item():
    item = input("Enter item to remove: ")
    if item in grocery_list:
        grocery_list.remove(item)
        print(f{item}' removed list.")
    else:
        print(f {item}' not found in the list.")

def show_items():
    if not grocery_list:
        print("grocery list is empty.")
    else:
        print(" Grocery List:")
        for idx, item in enumerate(grocery_list, start=1):
            print(f"{idx}. {item}")


print("Welcome to Grocery Manager ")

while True:
    print("\nChoose an option:")
    print("1. Add item")
    print("2. Remove item")
    print("3. Show all items")
    print("0. Exit")

    choice = input("Enter your choice (1-0): ")

    if choice == '1':
        add_item()
    elif choice == '2':
        remove_item()
    elif choice == '3':
        show_items()
    elif choice == '0':
        print("Goodbye")
        break
    else:
        print("Invalid choice.try again.")
