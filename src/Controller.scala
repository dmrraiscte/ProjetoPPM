package ProjetoPPM

import ProjetoPPM.Initial._
import javafx.fxml.FXML
import javafx.scene.control.{Button, ToggleButton, Tooltip}
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import javafx.scene.text._
import GroupUsers._
import Pure._

class Controller{

  @FXML
  private var button1: Button =_
  @FXML
  private  var buttonscale1: Button =_
  @FXML
  private  var buttonscale2: Button =_
  @FXML
  private var tooltip1: Tooltip =_
  @FXML
  private var image1: ImageView =_
  @FXML
  private var text1: Text =_
  @FXML
  private var text2: Text =_
  @FXML
  private var text3: Text =_
  @FXML
  private var toggleButton1: ToggleButton =_

  @FXML
  private var borderPane1: BorderPane =_



  def onButton1Clicked(): Unit={
    println("Hello World")
  }

  def greenRemoveButton(): Unit={
    oct1 = mapColourEffect(greenRemove,oct1)
  }

  def onButtonScale1Clicked(): Unit = {
    oct1 = GroupUsers.scaleOctree(0.5,oct1, worldRoot)

  }

  def onButtonScale2Clicked(): Unit = {
    oct1 = GroupUsers.scaleOctree(2,oct1, worldRoot)
  }

  def changeFontHeretica(): Unit = {
    text1.setFont(Font.font("Heretica", FontWeight.BOLD, FontPosture.REGULAR, 20))
    text2.setFont(Font.font("Heretica", FontWeight.BOLD, FontPosture.REGULAR, 25))
    text3.setFont(Font.font("Heretica", FontWeight.BOLD, FontPosture.REGULAR, 10))

  }

  def clickToggle(): Unit = {
    if(toggleButton1.isSelected)
      oct1=mapColourEffect(sepia,oct1)
    else
      println("adeus")
  }

  def startVisualize(): Unit = {
    borderPane1.setVisible(false)
  }
/*

stylesheets="@style.css"

  def lightmode(): Unit = {
    subscene.setFill(Color.WHITE)
  }

  def darkmode(): Unit = {
    subscene.setFill(Color.DARKSLATEGRAY)
  }
  */
}
