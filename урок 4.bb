Graphics3D 640, 480
SetBuffer BackBuffer()

car=CreateCube()
PositionEntity car,0,-1,0
ScaleEntity car,0.5,0.3,0.5
EntityColor car,255,0,0

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

For i=1 To 50 
cube6=CopyEntity(cube5)
PositionEntity cube6,i*4,0,0
Next  

shere2=CreateSphere(64,car)
PositionEntity shere2,1.4,-2,0 
ScaleEntity shere2,0.2,0.5,0.5

shere3=CopyEntity (shere2,car)
PositionEntity shere3,-1.4,-2,0 

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