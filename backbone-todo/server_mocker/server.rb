require 'sinatra'
require 'sinatra/json'
require 'json'

todos = Array.new

get '/todos' do
  json todos
end

post '/todos' do
  request_body = JSON.parse request.body.read
  p "receive request: " + request_body.to_s
  response_body = request_body.merge('id' => Time.now.to_i)
  todos.push response_body
  p todos
  p response_body
  json response_body
end

put '/todos/:id' do
  p "id = " + params[:id]
  request_body = JSON.parse request.body.read
  p "receive request: " + request_body.to_s

  result = todos.each do |t| 
    if t['id'].to_s.eql?(params[:id])
      t = request_body
      break
    end
  end
  json request_body
end

delete '/todos/:id' do
  p "id = " + params[:id]
  todos.delete_if do |t|
    t['id'].to_s.eql?(params[:id])
  end
  p todos
  true
end
