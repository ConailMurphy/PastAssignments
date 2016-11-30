import Tkinter
import tkMessageBox

window = Tkinter.Tk()

def onButtonClick():
    tkMessageBox.showinfo("Hello Python", "Hello World")

one = Tkinter.Button(window, text = "1", command = onButtonClick, borderwidth = 1).grid(row =0, column = 0, columnspan = 2)
two = Tkinter.Button(window, text = "2", command = onButtonClick)
three = Tkinter.Button(window, text = "3", command = onButtonClick)

#one.pack()
two.pack()
three.pack()
window.mainloop()


"""

import Tkinter
import tkMessageBox

top = Tkinter.Tk()

def helloCallBack():
   tkMessageBox.showinfo( "Hello Python", "Hello World")

B = Tkinter.Button(top, text ="Hello", command = helloCallBack)

B.pack()
top.mainloop()

"""