Graphics3D 640, 480
SetBuffer BackBuffer()
Const tc=1,tp=2
Collisions tc,tp,1,1

car=CreateCube()
PositionEntity car,0,-0.5,4
ScaleEntity car,0.5,0.3,0.5
EntityColor car,255,0,0
EntityType car,tc

cam=CreateCamera(car)
PositionEntity cam,0,0,-5
CameraClsColor cam,0,128,255

sphere=CreateSphere()
PositionEntity sphere,100,300,500
ScaleEntity sphere,100,100,100
tex=LoadTexture ("5.jpg")
EntityTexture sphere,tex 

cube2=CreateCube()
PositionEntity cube2,5,0,5
tex=LoadTexture ("2.jpg")
EntityTexture cube2,tex

cube3=CreateCube()
PositionEntity cube3,10,0,5
tex=LoadTexture ("6.png")
EntityTexture cube3,tex

cone2=CreateCone()
PositionEntity cone2,5,2,5
tex=LoadTexture ("3.jpg")
EntityTexture cone2,tex

Floor1=CreatePlane()
PositionEntity Floor1,0,-1,0
tex=LoadTexture ("4.jpg")
EntityTexture Floor1,tex

cube5=CreateCube()
tex=LoadTexture ("2.jpg")
EntityTexture cube5,tex

cone4=CreateCone(32,True,cube5)
PositionEntity cone4,0,2,0
tex=LoadTexture ("3.jpg")
EntityTexture cone4,tex

For i=1 To 64 
cube6=CopyEntity(cube5)
PositionEntity cube6,i*4,0,0
Next  

shere2=CreateSphere(64,car)
PositionEntity shere2,1.4,-1,0 
ScaleEntity shere2,0.2,0.5,0.5

shere3=CopyEntity (shere2,car)
PositionEntity shere3,-1.4,-1,0 

house=CreateCube()
PositionEntity house,15,1,15
ScaleEntity house,2,2,2
tex=LoadTexture ("2.jpg")
EntityTexture house,tex

garage=CreateCube(house)
PositionEntity garage,-1.5,-0.5,0	
ScaleEntity garage,0.5,0.5,1
tex=LoadTexture ("7.jpg")
EntityTexture garage,tex

roof1=CreateCube(house)
PositionEntity roof1,-0.5,1.7,0
ScaleEntity roof1,1,0.1,1
TurnEntity roof1,0,0,60
tex=LoadTexture ("3.jpg")
EntityTexture roof1,tex

roof2=CopyEntity (roof1,house)
PositionEntity roof2,0.5,1.7,0
TurnEntity roof2,0,0,-120
tex=LoadTexture ("3.jpg")
EntityTexture roof2,tex

roof3=CreateCube (house)
PositionEntity roof3,-0,0.7,-1.8
ScaleEntity roof3,1,0.1,1
TurnEntity roof3,-10,0,0
tex=LoadTexture ("3.jpg")
EntityTexture roof3,tex

kolonna=CreateCylinder(64,True,house)
PositionEntity kolonna,0.8,-0.2,-1.8
ScaleEntity kolonna,0.2,0.8,0.2
tex=LoadTexture ("7.jpg")
EntityTexture kolonna,tex

kolonna2=CreateCylinder(64,True,house)
PositionEntity kolonna2,-0.8,-0.2,-1.8
ScaleEntity kolonna2,0.2,0.8,0.2
tex=LoadTexture ("7.jpg")
EntityTexture kolonna2,tex  

lake=CreateCylinder(64,True,house)
PositionEntity lake,2.5,-1,0
ScaleEntity lake,1,0.00005,1
tex=LoadTexture ("8.jpeg")
EntityTexture lake,tex
obezjani=LoadSprite("13.png",4,osobnjk)
PositionEntity obezjani,0,1.5,0
SpriteViewMode obezjani,4
ScaleSprite obezjani,0.5,0.5

car2=LoadSprite("11.png",4,house)
PositionEntity car2,-3,-0.6,0
ScaleSprite car2,3,3

For a=2 To 12
house2=CopyEntity(house)
PositionEntity house2,a*20,1,15
Next 

palma=LoadSprite("9.png",4)
PositionEntity palma,0,3,-3
SpriteViewMode palma,4
ScaleSprite palma,2,4
EntityType palma,tp 

obezjana=LoadSprite("12.png",4,palma)
PositionEntity obezjana,0.2,-3.8,0.2

For b=1 To 150
palma2=CopyEntity(palma)
EntityType palma2,tp
PositionEntity palma2,Rnd(-40,0),3,Rnd(-40,80)
Next 

derevo=LoadSprite("10.png",4)
PositionEntity derevo,0,3,-3
SpriteViewMode derevo,4
ScaleSprite derevo,2,4

For b=1 To 150
derevo2=CopyEntity(derevo)
PositionEntity derevo,Rnd(-40,0),3,Rnd(-40,80)
Next 

While Not KeyDown(1)

;MoveEntity cube5,0.01,0,0 

If MouseDown(1) TurnEntity cam, 0, 2, 0
If MouseDown(2) TurnEntity cam, 0, -2, 0

TurnEntity sphere,0.05,0.05,0.05

If KeyDown(200) MoveEntity car, 0, 0, 0.2
If KeyDown(208) MoveEntity car, 0, 0, -0.2
If KeyDown(203) TurnEntity car, 0, 2, 0
If KeyDown(205) TurnEntity car, 0, -2, 0

If KeyDown(44) MoveEntity car, 0, .1, 0
If KeyDown(45) MoveEntity car, 0, -.1, 0

;PointEntity cam, cube4


UpdateWorld
RenderWorld

Flip
Wend   

End 