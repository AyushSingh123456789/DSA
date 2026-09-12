# Print 'Ayush' 4 times using recursion:

# 1. HEAD RECURSION: First the work, then call the function.(Condition -> Work -> Function call)

count = 0
def name():
    global count
    if count == 4:
        return
    print("Ayush", end=" ")
    count += 1
    name()
name() # 1st line of code to get processed in the interpreter.

#2. TAIL RECURSION(Back tracking): First call the function, then the work.(Condition -> Function Call -> Work) 

count2 = 0
def address():
    global count2
    if count2 == 4:
        return
    count2 += 1
    address()
    print("Patna", end=" ")
address() # 1st line of code to get processed in the interpreter.

# Time Complexity: O(N+1) ~ O(N)
# Space Complexity(filling of substack memory, but later released): O(N+1) ~ O(N) {Worst Case}