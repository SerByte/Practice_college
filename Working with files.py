file_name = input("Enter a filename with an extension. Example: Text.txt: \n")

f = open(file_name, "x")

print("The file was sucessful created")

f = open(file_name, "r")

print(f"The content in the file: {f.read()}")

f = open(file_name, "a")

content = input("Enter text to append to the file: ")

f.write(content)
f.close()

print(f"Content {content} successfully added to the file")

open(file_name, "w").close()

print("The entire contents of the file have been deleted")
