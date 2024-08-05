# Generated by Selenium IDE
import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

class Test2LoginNULL():
  def setup_method(self, method):
    self.driver = webdriver.Remote(command_executor='http://localhost:4444/wd/hub', desired_capabilities=DesiredCapabilities.CHROME)
    self.vars = {}
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_2LoginNULL(self):
    # Test name: 2_Login_NULL
    # Step # | name | target | value
    # 1 | open | / | 
    self.driver.get("https://www.saucedemo.com/")
    # 2 | setWindowSize | 1050x718 | 
    self.driver.set_window_size(1050, 718)
    # 3 | click | css=*[data-test="login-button"] | 
    self.driver.find_element(By.CSS_SELECTOR, "*[data-test=\"login-button\"]").click()
    # 4 | click | css=.error-message-container | 
    self.driver.find_element(By.CSS_SELECTOR, ".error-message-container").click()
    # 5 | assertText | css=*[data-test="error"] | Epic sadface: Username is required
    assert self.driver.find_element(By.CSS_SELECTOR, "*[data-test=\"error\"]").text == "Epic sadface: Username is required"
    # 6 | close |  | 
    self.driver.close()
  
