from django.urls import path
from .views import *

urlpatterns = [
    path('home/', home, name='home'),
    path('', login_view, name='login'),
    path('loguot/',logout_view, name='logout'),
    path('cadastro/',cadastro, name='cadastro'),
    path('montagem/',montagem, name='montagem'),
    
]
