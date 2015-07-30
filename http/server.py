#!/usr/bin/python

import json
from flask import Flask
app = Flask(__name__)

"""
writing a simple web server in python, sending back JSON, and then parsing it in javascript and curl
we kind of did some of it 

or a simple HTTP server with REST endpoints

Expected:

server.py, index.html, and app.js



the idea would be that the JS will load up, make an AJAX call to the server.py process for some JSON, and then print the results


"""

@app.route("/") # take note of this decorator syntax, it's a common pattern
def hello():
    return "Hello World!"

if __name__ == "__main__":
    app.run()