# Variables
DOCKER_COMPOSE_FILE = docker-compose.yml
PROJECT_NAME = sb3t0

# Default target (help message)
.PHONY: help
help:
	@echo "Makefile for Docker Compose Management"
	@echo ""
	@echo "Usage:"
	@echo "  make build       Build all Docker services"
	@echo "  make up          Start all services in detached mode"
	@echo "  make down        Stop all services and remove containers"
	@echo "  make restart     Restart all services"
	@echo "  make logs        Show logs for all services"
	@echo "  make clean       Remove containers, networks, and volumes"
	@echo ""

# Build services
.PHONY: build
build:
	docker compose -f $(DOCKER_COMPOSE_FILE) -p $(PROJECT_NAME) build

# Start services
.PHONY: up
up:
	docker compose -f $(DOCKER_COMPOSE_FILE) -p $(PROJECT_NAME) up -d

# Stop services and remove containers
.PHONY: down
down:
	docker compose -f $(DOCKER_COMPOSE_FILE) -p $(PROJECT_NAME) down

# Restart services
.PHONY: restart
restart: down up

# Show logs
.PHONY: logs
logs:
	docker compose -f $(DOCKER_COMPOSE_FILE) -p $(PROJECT_NAME) logs -f

# Clean up (containers, networks, and volumes)
.PHONY: clean
clean:
	docker compose -f $(DOCKER_COMPOSE_FILE) -p $(PROJECT_NAME) down --volumes --remove-orphans