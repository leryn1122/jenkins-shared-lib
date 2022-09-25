#!/usr/bin/env groovy

def doColor(message, color) {
  // `AnsibleColor` plugin required。
  ansiColor('xterm') {
    println "\033[${color}m${message}\033[0m"
  }
}

def red(message) {
  doColor(message, "31")
}

def green(message) {
  doColor(message, "32")
}

def yellow(message) {
  doColor(message, "33")
}

def blue(message) {
  doColor(message, "34")
}

def magenta(message) {
  doColor(message, "35")
}

def cyan(message) {
  doColor(message, "36")
}

def white(message) {
  doColor(message, "37")
}