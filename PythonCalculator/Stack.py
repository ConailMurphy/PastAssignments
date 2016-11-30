# class for keeping track of operands/operator

class Stack:

    def __init__(self):
        self.__stack = []

    def push(self, element):
        self.__stack.append(element)

    def pop(self):
        if self.isEmpty():
            return None
        else:
            return self.__stack.pop()

    def isEmpty(self):
        return len(self.__stack) == 0

    def clearStack(self):
        while len(self.__stack) < 0:
            self.__stack.pop()

def testStack():
    stack =Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    i1 = stack.pop()
    i2 = stack.pop()
    i3 = stack.pop()
    i4 = stack.pop()

    print i1
    print i2
    print i3
    print i4

testStack()