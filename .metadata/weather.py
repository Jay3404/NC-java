# -*- coding: utf-8 -*-
import json

import requests

api_key = "9fc0493ca38aecbba10e4a254b6fd833" # 본인이 발급받은 API 키를 입력해주세요.
url = f'http://api.openweathermap.org/data/2.5/weather?q=Seoul&appid={api_key}&units=metric'

response = requests.get(url)
data = json.loads(response.text)

print('City:', data['name'])
print('Current temperature:', data['main']['temp'])
print('Sensory temperature:', data['main']['feels_like'])
print('Lowest temperature:', data['main']['temp_min'])
print('Highest temperature:', data['main']['temp_max'])
print('Humidity:', data['main']['humidity'])
print('Pressure:', data['main']['pressure'])
print('Weather:', data['weather'][0]['description'])
print(1000000*(1.12)**10)