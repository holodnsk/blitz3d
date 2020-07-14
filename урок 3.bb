Graphics3D 640, 480
SetBuffer BackBuffer()

cube4=CreateCube()
PositionEntity cube4,0,0,0
ScaleEntity cube4,0.5,0.3,0.5
EntityColor cube4,255,0,0

cam=CreateCamera(cube4)
PositionEntity cam,0,0,-5
CameraClsColor cam,0,128,255


sphere=CreateSphere()
PositionEntity sphere,100,300,500
ScaleEntity sphere,100,100,100
tex=LoadTexture ("5.jpg")
EntityTexture sphere,tex

For A=1 To 10 
cube=CreateCube()
PositionEntity cube,0,0,5*A 
tex=LoadTexture ("2.jpg")
EntityTexture cube,tex
Next 

cube2=CreateCube()
PositionEntity cube2,5,0,5
tex=LoadTexture ("2.jpg")
EntityTexture cube2,tex

cube3=CreateCube()
PositionEntity cube3,10,0,5
tex=LoadTexture ("6.png")
EntityTexture cube3,tex

For A=1 To 10
cone=CreateCone()
PositionEntity cone,0,2,5*A
tex=LoadTexture ("3.jpg")
EntityTexture cone,tex
Next 

cone2=CreateCone()
PositionEntity cone2,5,2,5
tex=LoadTexture ("3.jpg")
EntityTexture cone2,tex

Floor1=CreatePlane()
PositionEntity Floor1,0,-1,0
tex=LoadTexture ("4.jpg")
EntityTexture Floor1,tex

While Not KeyDown(1)

TurnEntity sphere,0.05,0.05,0.05

If KeyDown(200) MoveEntity cube4, 0, 0, 0.2
If KeyDown(208) MoveEntity cube4, 0, 0, -0.2
If KeyDown(203) TurnEntity cube4, 0, 2, 0
If KeyDown(205) TurnEntity cube4, 0, -2, 0

If KeyDown(44) MoveEntity cube4, 0, .1, 0
If KeyDown(45) MoveEntity cube4, 0, -.1, 0

PointEntity cam, cube4


UpdateWorld
RenderWorld

Flip
Wend   

End 