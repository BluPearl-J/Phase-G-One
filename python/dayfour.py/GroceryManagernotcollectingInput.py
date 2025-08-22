grocery_list = []

def add_item(item):
    grocery_list.append(item)
    return f"{item} added."

def remove_item(item):
    if item in grocery_list:
        grocery_list.remove(item)
        return f"{item} removed from list."
    else:
        return f"{item} not found in  list."

def show_items():
    if not grocery_list:
        return "Grocery list is empty."
    else:
        return [f"{idx}. {item}" for idx, item in enumerate(grocery_list, start=1)]
        #function value passed not from user
