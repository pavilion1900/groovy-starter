package ru.clevertec.lesson7

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * / /
 * $/ /$
 */

//def name = "Ivan 'my' friend"
def name = "Ivan"
def value = 'Hello "my" world'
def stringValue = "Hello $name"
println stringValue

def value2 = """
SELECT *
FROM
table WHERE name = $name;
table WHERE name = ${getWithPrefix(name)};
"""
println value2
value3 = '''
SELECT *
FROM
table WHERE id = 10;
'''
println value3

def value5 = 'H'
Character value6 = 'H'

def value7 = /Hello world $name/
println value7
def value8 = $/Hello world $name/$
println value8

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - "va"

def getWithPrefix(String name) {
    "prefix-" + name
}