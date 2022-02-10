#Autor:Billi

@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screemplay at the Choucair Academy with the automation course
  @scenario
  Scenario: Search for a atomation course
    Given than brandon wants to learn automation at the academy Choucair
    |strUser|strPassword|
    |89341138|Choucair2022*|
    When he search for the course on the choucair academy plataform
    |strCourse|
    |Foundation Level|
    Then he finds the course called resource
    |strCourse|
    |Foundation Level|
