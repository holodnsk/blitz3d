Graphics3D 640, 480
SetBuffer BackBuffer()

Const tc=1,te=2
Collisions tc,te,2,3

cam=CreateCamera()
PositionEntity cam,0,0,-5
CameraClsColor cam,0,128,255
EntityType cam,tc
EntityRadius cam,1.5

Floor1=CreatePlane()
PositionEntity Floor1,0,-1.5,0
;tex=LoadTexture ("4.jpg")
;EntityTexture Floor1,tex
EntityColor Floor1,255,160,240
EntityType Floor1,te
EntityPickMode Floor1,2
NameEntity Floor1,"Floor1"

player=CreateSphere()
PositionEntity player,0, 0, 0
;tex=LoadTexture ("4.jpg")
;EntityTexture player,tex
EntityColor player,120,160,240
EntityType player,te
EntityPickMode player,2
NameEntity player,"sharik"

cone=CreateCone() 
EntityType cone,te
PositionEntity cone,0,0,5 
EntityPickMode cone,2
NameEntity cone,"cone"

While Not KeyDown(1)

If MouseHit(1)=True
ent = CameraPick(cam,MouseX(),MouseY())
If ent 
name$ = EntityName(ent)
If name = "sharik" Then HideEntity player
If name = "cone" Then
 ShowEntity player
 EntityColor cone,0,Rnd(255),0
 EntityColor player,Rnd(255),0,0
EndIf 
If name = "Floor1" Then EntityColor Floor1,0,0,Rnd(255)
EndIf
EndIf

If KeyDown(200) MoveEntity cam, 0, 0, 0.2
If KeyDown(208) MoveEntity cam, 0, 0, -0.2
If KeyDown(203) TurnEntity cam, 0, 2, 0
If KeyDown(205) TurnEntity cam, 0, -2, 0

If KeyDown(44) MoveEntity cam, 0, .1, 0
If KeyDown(45) MoveEntity cam, 0, -.1, 0

UpdateWorld
RenderWorld

Flip
Wend
End